/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.it.xcommerce.core.entities;


/**
 *
 * @author Omar IRAQI
 */
public class Customer{
    protected String name;
    protected String emailAddress;
    protected String address;
        
    protected Customer(){

    }

    public Customer(String name, String emailAddress, String address){
        this.name = name;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
