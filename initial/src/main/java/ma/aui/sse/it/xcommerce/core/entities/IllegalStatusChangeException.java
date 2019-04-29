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
public class IllegalStatusChangeException extends Exception{
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
