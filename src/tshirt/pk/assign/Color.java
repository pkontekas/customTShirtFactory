package tshirt.pk.assign;

import tshirt.pk.assign.validator.Validator;
import java.util.Scanner;
/**
 * @author pkontekas
 */
public enum Color {

    RED(2), ORANGE(1.5), YELLOW(1.7), GREEN(1.8), BLUE(1.9), INDIGO(2.1), VIOLET(2.2);
    public double colorPrice;

    private Color(double colorPrice) {
        this.colorPrice = colorPrice;
    }

    public static Color chooseColor(Scanner scan) {
        int choice;
        System.out.print("one of the following options please : \n");
        int counter = 0;
        for (Color c : Color.values()) {
            counter++;
            System.out.println(counter + ". " + c + "(Increases price by: " + c.colorPrice + " Euros)");
        }
        choice = Validator.getValidMenuChoice(7, scan);
        switch (choice) {
            case 1:
                return Color.RED;
            case 2:
                return Color.ORANGE;
            case 3:
                return Color.YELLOW;
            case 4:
                return Color.GREEN;
            case 5:
                return Color.BLUE;
            case 6:
                return Color.INDIGO;
            case 7:
                return Color.VIOLET;
        }
        return null;
    }
}
