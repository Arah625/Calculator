package Logic;

import java.util.Scanner;

public class Multiplication {

    public static void multiplicationMethod() {
        boolean multiplicationIsRunning = true;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Chosen: Multiplication");
        while (multiplicationIsRunning) {
            MenuToDisplay.displayMultiplicationMenu();
            int chooseActionInMultiplication = scanner.nextInt();
            switch (chooseActionInMultiplication) {
                case 1:
                    System.out.println("Please set first number");
                    double firstMultiplicationNumber = scanner.nextDouble();
                    System.out.println("Please set second number");
                    double Multiplication = scanner.nextDouble();
                    double multiplicationResult = firstMultiplicationNumber * Multiplication;
                    System.out.println(firstMultiplicationNumber + " * " + Multiplication + " = " + multiplicationResult);
                    break;
                case 0:
                    System.out.println("Chosen: Back to main menu");
                    multiplicationIsRunning = false;
                    break;
                default:
                    System.out.println("Wrong button! Please select action by clicking 1 or 0");
                    break;
            }
        }
    }
}
