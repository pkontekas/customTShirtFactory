package tshirt.pk.assign.pay;
/**
 * @author pkontekas
 */
public class PayCash implements PaymentType{

    @Override
    public double payCustomShirt(double colorPrice, double fabricPrice, double sizePrice) {
        double finalPrice = 10 + colorPrice + fabricPrice + sizePrice;
        System.out.println("Payment will be done with Cash.");
        return finalPrice;
    }
    
}
