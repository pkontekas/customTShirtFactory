package tshirt.pk.assign;

import tshirt.pk.assign.validator.Validator;
import java.util.Scanner;
/**
 * @author pkontekas
 */
public enum Fabric {

    WOOL(5), COTTON(5.1), POLYESTER(5.2), RAYON(4.8), LINEN(4.9), CASHMERE(4.7), SILK(5.3);
    public double fabricPrice;

    private Fabric(double fabricPrice) {
        this.fabricPrice = fabricPrice;
    }

    public static Fabric chooseFabric(Scanner scan) {
        int choice;
        System.out.print("one of the following options please : \n");
        int counter = 0;
        for (Fabric f : Fabric.values()) {
            counter++;
            System.out.println(counter + ". " + f + "(Increases price by: " + f.fabricPrice + " Euros)");
        }
        choice = Validator.getValidMenuChoice(7, scan);
        switch (choice) {
            case 1:
                return Fabric.WOOL;
            case 2:
                return Fabric.COTTON;
            case 3:
                return Fabric.POLYESTER;
            case 4:
                return Fabric.RAYON;
            case 5:
                return Fabric.LINEN;
            case 6:
                return Fabric.CASHMERE;
            case 7:
                return Fabric.SILK;
        }
        return null;
    }
}
