import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int optionSelect;
        Scanner scanner = new Scanner(System.in);
        // WELCOME SECTION
        printMenu();

        while (true) {
            optionSelect = scanner.nextInt();
            if (optionSelect == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                if (optionSelect == 1) {

                    System.out.println("Month: ");
                    String monthName = scanner.next();

                    System.out.println("Day: ");
                    int dayNumber = scanner.nextInt();

                    System.out.println("Number of steps: ");
                    int stepsCounter = scanner.nextInt();

                    StepTracker.saveStepCounter(monthName, dayNumber, stepsCounter, StepTracker.stepsForYear);
                }
                printMenu();
            }
        }
    }

    public static void printMenu() {
        System.out.println("Welcome to StepTracker!");
        System.out.println("There are options that you can use:");
        System.out.println("1. Enter the number of steps for a specific day");
        System.out.println("2. Print stat for specific month");
        System.out.println("3. Change goal for steps in a day");
        System.out.println("4. Exit");
    }
}
