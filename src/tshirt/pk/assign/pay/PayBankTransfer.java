package tshirt.pk.assign.pay;
/**
 * @author pkontekas
 */
public class PayBankTransfer implements PaymentType {

    @Override
    public double payCustomShirt(double colorPrice, double fabricPrice, double sizePrice) {
        double finalPrice = 10 + colorPrice + fabricPrice + sizePrice + 1;
        //1 euro more expensive due to bank transfer
        System.out.println("Payment will be done with a Bank Transfer.");
        return finalPrice;
    }
    
}
