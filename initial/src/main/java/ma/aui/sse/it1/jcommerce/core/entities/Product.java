/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.it1.jcommerce.core.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Omar IRAQI
 */
@Entity
public class Product extends JpaEntity{
    
    private int quantity;
    private float weight;
    private String name;
    private String brand;
    private float price;
    @ManyToOne
    private Category category;
    private boolean active;

    protected Product(){

    }

    public Product(String name, String brand, float price, int quantity, float weight){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        category = null;
        active = false;        
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
