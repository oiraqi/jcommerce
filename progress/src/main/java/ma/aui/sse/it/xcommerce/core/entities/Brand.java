package ma.aui.sse.it.xcommerce.core.entities;

import javax.persistence.Entity;

/**
 *
 * @author Omar IRAQI
 */
@Entity
public class Brand  extends AbstractJpaEntity {
    
    private static final long serialVersionUID = -7014503160098567776L;
    private String name; // read-only
    
    protected Brand(){

    }

    public Brand(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}