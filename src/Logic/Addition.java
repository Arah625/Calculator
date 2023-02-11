package Logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Addition {

    public static void additionMethod() {
        boolean additionIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chosen: Addition");
        while (additionIsRunning) {
            MenuToDisplay.displayAdditionMenu();
            int chooseActionInAddition = scanner.nextInt();
            switch (chooseActionInAddition) {
                case 1:
                    try {
                        System.out.println("Please set first number");
                        double firstAdditionNumber = scanner.nextDouble();
                        System.out.println("Please set second number");
                        double secondAdditionNumber = scanner.nextDouble();
                        double additionResult = firstAdditionNumber + secondAdditionNumber;
                        System.out.println(firstAdditionNumber + " + " + secondAdditionNumber + " = " + additionResult);
                        break;
                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("Please use numbers as input");
                        inputMismatchException.getStackTrace();
                    }
                case 0:
                    System.out.println("Chosen: Back to main menu");
                    additionIsRunning = false;
                    break;
                default:
                    System.out.println("Wrong button! Please select action by clicking 1 or 0");
                    break;
            }
        }
    }
}
