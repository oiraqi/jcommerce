package ma.aui.sse.it.xcommerce.microservices.order.entities;

import javax.validation.constraints.NotNull;

/**
 *
 * @author Omar IRAQI
 */
public class Product {
    
    private String barcode;
    private String name;
    private float weight;    
    private String brand;
    private float price;

    protected Product(){

    }

    public Product(String barcode, String name, String brand, float price, float weight){
        this.barcode = barcode;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public String getBarcode(){
        return barcode;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public boolean equals(Object other){
        if(barcode == null || other == null || !(other instanceof Product))
            return false;
        
        return barcode.equals(((Product)other).getBarcode());
    }
}
