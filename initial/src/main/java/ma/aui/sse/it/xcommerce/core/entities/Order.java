/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.it.xcommerce.core.entities;

import java.util.Hashtable;

/**
 *
 * @author Omar IRAQI
 */
public class Order {
    
    protected Customer customer;
    protected OrderStatus status;
    protected float productsTotalPrice;
    protected float shippingCost;
    protected static final float TAX_RATE = (float)0.2;
    protected Hashtable<Product, Integer> purchasedProducts;

	protected Order(){
		
	}

    public Order(Customer customer, Hashtable<Product, Integer> purchasedProducts, 
                float productsTotalPrice, float shippingCost){
        this.customer = customer;
        this.purchasedProducts = purchasedProducts;
        this.productsTotalPrice = productsTotalPrice;
        this.shippingCost = shippingCost;
        status = OrderStatus.HANDLING;
    }
    public void updateStatus(OrderStatus newStatus) throws IllegalStatusChangeException{
        if(status == OrderStatus.CANCELED || status == OrderStatus.DELIVERED)
            throw new IllegalStatusChangeException(newStatus);
        status = newStatus;
        //use JavaMail API to send a notification to the customer by email
    }


    public Customer getCustomer() {
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