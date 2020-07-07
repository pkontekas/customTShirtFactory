package tshirt.pk.assign;

import tshirt.pk.assign.validator.Validator;
import java.util.Scanner;
import tshirt.pk.assign.pay.PayBankTransfer;
import tshirt.pk.assign.pay.PayCash;
import tshirt.pk.assign.pay.PayDebit;
import tshirt.pk.assign.pay.PaymentType;
/**
 * @author pkontekas
 */
public class Main {

    private static Scanner scan;

    public Main() {
        Main.scan = new Scanner(System.in);
    }

    public static void main(String[] args) {
        // Create Tshirts at runtime, with desired payment method, color, fabric, and size

        //Create Some Sample TShirts
        sampleTshirts();

        //lets make some methods to create any number of custom shirts with user input!!
        Main main = new Main();
        main.makeCustomTshirt(scan);

    }
    
    public static void sampleTshirts()
    {
        CreateTShirt createTShirt1 = new CreateTShirt(new PayCash(), Color.YELLOW, Fabric.LINEN, Size.XL);
        System.out.println("Your TShirt was successfully ordered with " + createTShirt1.executePayment() + " Euros. Thank you!!");

        CreateTShirt createTShirt2 = new CreateTShirt(new PayDebit(), Color.GREEN, Fabric.WOOL, Size.M);
        System.out.println("Your TShirt was successfully ordered with " + createTShirt2.executePayment() + " Euros. Thank you!!");

        CreateTShirt createTShirt3 = new CreateTShirt(new PayBankTransfer(), Color.BLUE, Fabric.SILK, Size.XXL);
        System.out.println("Your TShirt was successfully ordered with " + createTShirt3.executePayment() + " Euros. Thank you!!");
    }

    public void makeCustomTshirt(Scanner scan) {
        boolean answer;
        System.out.println("\n\nWelcome to our New Custom T-SHIRT Factory!!");
        do {
            System.out.println("Choose a Color for your custom TShirt, ");
            Color customColor = Color.chooseColor(scan);
            System.out.println("You chose : " + customColor);
            System.out.println("Choose a Fabric for your custom TShirt, ");
            Fabric customFabric = Fabric.chooseFabric(scan);
            System.out.println("You chose : " + customFabric);
            System.out.println("Choose a Size for your custom TShirt, ");
            Size customSize = Size.chooseSize(scan);
            System.out.println("You chose : " + customSize);
            System.out.println("Choose a Payment for your custom TShirt, ");
            PaymentType chosenPayment = choosePayment(scan);

            CreateTShirt createTShirt = new CreateTShirt(chosenPayment, customColor, customFabric, customSize);
            System.out.println("Your TShirt was successfully ordered with " + createTShirt.executePayment() + " Euros. Thank you !!");
            System.out.println("Would you like to order more custom tShirts ?");
            answer = Validator.yesNoChoice(scan);
        } while (answer == true);

    }

    //choose a payment type
    public static PaymentType choosePayment(Scanner scan) {
        int choice;
        System.out.print("one of the following options please : \n");
        System.out.println("1. Pay with Bank Transfer.\n2. Pay with Cash.\n3. Pay with Debit/Credit Card.");

        choice = Validator.getValidMenuChoice(3, scan);
        switch (choice) {
            case 1:
                return new PayBankTransfer();
            case 2:
                return new PayCash();
            case 3:
                return new PayDebit();
        }
        return null;
    }
}
