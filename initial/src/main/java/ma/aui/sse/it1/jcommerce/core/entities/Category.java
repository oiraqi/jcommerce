/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.it1.jcommerce.core.entities;

import javax.persistence.Entity;

/**
 *
 * @author Omar IRAQI
 */
@Entity
public class Category  extends JpaEntity{
    private String name; //read-only
    
    protected Category(){

    }

    public Category(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}