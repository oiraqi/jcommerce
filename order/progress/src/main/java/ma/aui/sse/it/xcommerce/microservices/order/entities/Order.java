package ma.aui.sse.it.xcommerce.microservices.order.entities;

import java.util.Hashtable;

/**
 *
 * @author Omar IRAQI
 */
public class Order {
    
    protected String customer;
    protected OrderStatus status;
    protected float productsTotalPrice;
    protected float shippingCost;
    protected static final float TAX_RATE = (float)0.2;
    protected Hashtable<Product, Integer> purchasedProducts;

	protected Order(){
		
	}

    public Order(String customer, Hashtable<Product, Integer> purchasedProducts){
        this.customer = customer;
        this.purchasedProducts = purchasedProducts;
        this.productsTotalPrice = 0;
        this.shippingCost = 0;
        status = OrderStatus.HANDLING;
    }
    public void updateStatus(OrderStatus newStatus) throws IllegalStatusChangeException{
        if(status == OrderStatus.CANCELED || status == OrderStatus.DELIVERED)
            throw new IllegalStatusChangeException(newStatus);
        status = newStatus;
        //use JavaMail API to send a notification to the customer by email
    }


    public String getCustomer() {
        return customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public float getProductsTotalPrice(){
        return productsTotalPrice;
    }

    public float getShippingCost(){
        return shippingCost;
    }
}