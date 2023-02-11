package Logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Subtraction {

    public static void subtractionMethod() {
        boolean subtractionIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chosen: Subtraction");
        while (subtractionIsRunning) {
            MenuToDisplay.displaySubtractionMenu();
            int chooseActionInSubtraction = scanner.nextInt();
            switch (chooseActionInSubtraction) {
                case 1:
                    try {
                        System.out.println("Please set first number");
                        double firstSubtractionNumber = scanner.nextDouble();
                        System.out.println("Please set second number");
                        double secondSubtractionNumber = scanner.nextDouble();
                        double subtractionResult = firstSubtractionNumber - secondSubtractionNumber;
                        System.out.println(firstSubtractionNumber + " - " + secondSubtractionNumber + " = " + subtractionResult);
                        break;
                    }catch (InputMismatchException inputMismatchException){
                        System.out.println("Please use numbers as inpou");;
                    }
                case 0:
                    System.out.println("Chosen: Back to main menu");
                    subtractionIsRunning = false;
                    break;
                default:
                    System.out.println("Wrong button! Please select action by clicking 1 or 0");
                    break;
            }
        }
    }
}
