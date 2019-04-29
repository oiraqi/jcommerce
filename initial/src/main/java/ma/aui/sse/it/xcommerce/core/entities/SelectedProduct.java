/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.it.xcommerce.core.entities;

import javax.persistence.ManyToOne;

/**
 *
 * @author Omar IRAQI
 */
public class SelectedProduct {
    private Product product;
    private int selectedQuantity;
    @ManyToOne
    private Order order;

    protected SelectedProduct(){

    }
    
    public SelectedProduct(Product product){
        this.product = product;
        this.selectedQuantity = 1;
    }

    public SelectedProduct(Product product, int selectedQuantity){
        this.product = product;
        this.selectedQuantity = selectedQuantity;
    }
    
    public void updateSelectedQuantity(int newSelectedQuantity){
        this.selectedQuantity = newSelectedQuantity;
    }

    public int getSelectedQuantity() {
        return selectedQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setOrder(Order order){
        this.order = order;
    }
    
    public boolean equals(Object object){
        if(!(object instanceof SelectedProduct))
            return false;
        return ((SelectedProduct)object).getProduct().equals(product);
    }
}
