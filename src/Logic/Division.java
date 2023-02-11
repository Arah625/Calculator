package Logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void divisionMethod() {
        try {
            boolean divisionIsRunning = true;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Chosen: Division");
            while (divisionIsRunning) {
                MenuToDisplay.displayDivisionMenu();
                int chooseActionInDivision = scanner.nextInt();
                switch (chooseActionInDivision) {
                    case 1:
                        System.out.println("Please set first number");
                        double firstDivisionNumber = scanner.nextDouble();
                        System.out.println("Please set second number");
                        double secondDivisionNumber = scanner.nextDouble();
                        if (secondDivisionNumber != 0) {
                            double divisionResult = firstDivisionNumber / secondDivisionNumber;
                            System.out.println(firstDivisionNumber + " / " + secondDivisionNumber + " = " + divisionResult);
                        } else {
                            System.out.println("Second number cannot be 0!");
                        }
                        break;
                    case 0:
                        System.out.println("Chosen: Back to main menu");
                        divisionIsRunning = false;
                        break;
                    default:
                        System.out.println("Wrong button! Please select action by clicking 1 or 0");
                        break;
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("Wrong");
        }
    }
}
