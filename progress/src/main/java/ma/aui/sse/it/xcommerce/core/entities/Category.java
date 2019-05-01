package ma.aui.sse.it.xcommerce.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Omar IRAQI
 */
@Entity
public class Category  extends AbstractJpaEntity {
    
    private static final long serialVersionUID = 512632343574588379L;
    private String name; // read-only

    @ManyToOne
    private Category parentCategory;
    
    protected Category(){

    }

    public Category(String name, Category parentCategory){
        this.name = name;
        this.parentCategory = parentCategory;
    }

    public Category(String name){
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public Category getParentCategory(){
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory){
        this.parentCategory = parentCategory;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}