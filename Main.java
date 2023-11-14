import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int optionSelect;
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
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
                    if (stepTracker.checkData(dayNumber, monthName, stepsCounter)) {
                        stepTracker.changeData(dayNumber, monthName, stepsCounter, stepTracker.monthToData);
                    } else {
                        System.out.println("Incorrect input");
                    }

                } else if (optionSelect == 2) {
                    System.out.println("Month: ");
                    String monthName = scanner.next();
                    stepTracker.getMonth(monthName);
                } else if (optionSelect == 3) {
                    System.out.println("Your goal: ");
                    int steps = scanner.nextInt();
                    stepTracker.changeGoal(steps);
                    System.out.println("Now your goal is " + stepTracker.printGoal() + " steps");
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
