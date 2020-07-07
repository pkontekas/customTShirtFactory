package tshirt.pk.assign;

import tshirt.pk.assign.validator.Validator;
import java.util.Scanner;
/**
 * * @author pkontekas
 */
public enum Size {

    XS(1.1), S(1.2), M(1.3), L(1.4), XL(1.5), XXL(1.6), XXXL(1.7);
    public double sizePrice;

    private Size(double sizePrice) {
        this.sizePrice = sizePrice;
    }

    public static Size chooseSize(Scanner scan) {
        int choice;
        System.out.print("one of the following options please : \n");
        int counter = 0;
        for (Size size : Size.values()) {
            counter++;
            System.out.println(counter + ". " + size + "(Increases price by: " + size.sizePrice + " Euros)");
        }
        choice = Validator.getValidMenuChoice(7, scan);
        switch (choice) {
            case 1:
                return Size.XS;
            case 2:
                return Size.S;
            case 3:
                return Size.M;
            case 4:
                return Size.L;
            case 5:
                return Size.XL;
            case 6:
                return Size.XXL;
            case 7:
                return Size.XXXL;
        }
        return null;
    }

}
