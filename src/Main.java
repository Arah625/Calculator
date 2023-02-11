import Logic.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean programIsRunning = true;

        while (programIsRunning) {
            MenuToDisplay.displayMainMenu();
            int chooseOperation = scanner.nextInt();

            switch (chooseOperation) {
                case 1:
                    Addition.additionMethod();
                    break;
                case 2:
                    Subtraction.subtractionMethod();
                    break;
                case 3:
                    Multiplication.multiplicationMethod();
                    break;
                case 4:
                    Division.divisionMethod();
                    break;
                case 0:
                    System.out.println("Program is closing, exiting calculator");
                    programIsRunning = false;
                    break;
                default:
                    System.out.println("Wrong button! Please select action by clicking 1, 2, 3, 4, 0");
                    break;
            }
        }
    }
}