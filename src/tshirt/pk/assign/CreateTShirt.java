
package tshirt.pk.assign;

import tshirt.pk.assign.pay.PaymentType;
/**
 * @author pkontekas
 */
public class CreateTShirt {

    private final PaymentType paymentType;
    private final Color color;
    private final Fabric fabric;
    private final Size size;

    public CreateTShirt(PaymentType paymentType, Color color, Fabric fabric, Size size) {
        this.paymentType = paymentType;
        this.color = color;
        this.fabric = fabric;
        this.size = size;
    }



    public double executePayment() {
        return paymentType.payCustomShirt(color.colorPrice, fabric.fabricPrice, size.sizePrice);
    }

}
