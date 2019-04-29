/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.it1.jcommerce.core.entities;

import java.util.List;
import java.util.Vector;


/**
 *
 * @author Omar IRAQI
 */
public class ShoppingCart {
    private List<SelectedProduct> selectedProducts;
    private Customer customer;
    private float productsTotalPrice;
    private float shippingCost;    
    private static final float BASE_SHIPPING_COST = 25;  
    
    public ShoppingCart(Customer customer){
        this.customer = customer;
        selectedProducts = new Vector<SelectedProduct>();
        productsTotalPrice = 0;
        shippingCost = 0;
    }

    public void addSelectedProduct(Product product, int quantity) {
        SelectedProduct selectedProduct = searchByProduct(product);
        if(selectedProduct == null){ //this is the first time that the customer selects and adds such a product, so let's create a new SelectedProduct object
            selectedProduct = new SelectedProduct(product, quantity);
            selectedProducts.add(selectedProduct);
        }else //the product has already been selected and added by the customer, so let's just update its selected quantity
            selectedProduct.updateSelectedQuantity(quantity);
        
        //now, let's update the shopping cart prices, based on the selected quantity change
        //int selectedQuantityChange = selectedProduct.getSelectedQuantityChange();
        //product.updateShoppingCart(this, selectedQuantityChange);
    }

    /*public void removeSelectedProduct(String productId) {
        selectedProducts.remove(productId);
    }*/

    public float getProductsTotalPrice() {
        return productsTotalPrice;
    }

    public float getShippingCost() {
        return shippingCost;
    }

    public float getTotalPrice() {
        return productsTotalPrice + ((shippingCost == 0)? 0 : shippingCost + BASE_SHIPPING_COST);
    }

    public void checkout(){
        if(isEmpty())
            return;
        //if shipping cost is not null (shopping cart contains real products) then take into consideration the BASE_SHIPPING_COST
        shippingCost = (shippingCost == 0)? 0 : shippingCost + BASE_SHIPPING_COST;
        //create order and add it to the customer's list of orders
        //new Order(customer, selectedProducts, productsTotalPrice, shippingCost);
        //empty shopping cart for next order, by calling private method empty()
        empty();
    }
    
    public boolean isEmpty(){
        return productsTotalPrice == 0;
    }
    public void empty(){
        selectedProducts = new Vector<SelectedProduct>();
        productsTotalPrice = 0;
        shippingCost = 0;
    }
    
    private SelectedProduct searchByProduct(Product product){
        return null;//selectedProducts.search(new SelectedProduct(product, 0));
    }
    
    /*private SelectedProduct searchByProductId(String productId){
        return selectedProducts.searchByProductId(productId);
    }*/

    public void setProductsTotalPrice(float productsTotalPrice) {
        this.productsTotalPrice = productsTotalPrice;
    }

    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Customer getCustomer() {
        return customer;
    }
}
