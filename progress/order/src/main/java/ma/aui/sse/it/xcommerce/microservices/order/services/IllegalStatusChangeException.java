package ma.aui.sse.it.xcommerce.microservices.order.entities;

/**
 *
 * @author Omar IRAQI
 */
public class IllegalStatusChangeException extends Exception {
    private static final long serialVersionUID = -199006397514123367L;
    private OrderStatus problematicStatus;
    
    public IllegalStatusChangeException() {
        super();
    }

    public IllegalStatusChangeException(OrderStatus problematicStatus) {
        super();
        this.problematicStatus = problematicStatus;
    }

    public OrderStatus getProblematicStatus() {
        return problematicStatus;
    }
}
