package tshirt.pk.assign.pay;
/**
 * @author pkontekas
 */
public class PayDebit implements PaymentType{

    @Override
    public double payCustomShirt(double colorPrice, double fabricPrice, double sizePrice) {
        double finalPrice = (10 + colorPrice + fabricPrice + sizePrice)*0.85;
        //cheaper cause online payment (15% cheaper)
        System.out.println("Payment will be done with a Debit/Visa Card.");
        return finalPrice;
    }
    
}
