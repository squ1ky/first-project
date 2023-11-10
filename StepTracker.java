import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {

    public static HashMap<String, Integer[]> stepsForYear = new HashMap<>();
    public static void main(String[] args) {


        Integer[] januaryDays = new Integer[30];
        Integer[] februaryDays = new Integer[30];
        Integer[] marchDays = new Integer[30];
        Integer[] aprilDays = new Integer[30];
        Integer[] mayDays = new Integer[30];
        Integer[] juneDays = new Integer[30];
        Integer[] julyDays = new Integer[30];
        Integer[] augustDays = new Integer[30];
        Integer[] septemberDays = new Integer[30];
        Integer[] octoberDays = new Integer[30];
        Integer[] novemberDays = new Integer[30];
        Integer[] decemberDays = new Integer[30];

        stepsForYear.put("January", januaryDays);
        stepsForYear.put("February", februaryDays);
        stepsForYear.put("March", marchDays);
        stepsForYear.put("April", aprilDays);
        stepsForYear.put("May", mayDays);
        stepsForYear.put("June", juneDays);
        stepsForYear.put("July", julyDays);
        stepsForYear.put("August", augustDays);
        stepsForYear.put("September", septemberDays);
        stepsForYear.put("October", octoberDays);
        stepsForYear.put("November", novemberDays);
        stepsForYear.put("December", decemberDays);



    }
    public static void saveStepCounter(String monthName, int dayNumber, int stepCount, HashMap stepsForYear) {
        if (stepCount >= 0) {
            if (dayNumber >= 1 && dayNumber <= 30) {
                if (monthName.equals("January")) {
                    Integer[] array = (Integer[]) stepsForYear.get("January");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("February")) {
                    Integer[] array = (Integer[]) stepsForYear.get("February");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("March")) {
                    Integer[] array = (Integer[]) stepsForYear.get("March");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("April")) {
                    Integer[] array = (Integer[]) stepsForYear.get("April");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("May")) {
                    Integer[] array = (Integer[]) stepsForYear.get("May");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("June")) {
                    Integer[] array = (Integer[]) stepsForYear.get("June");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("July")) {
                    Integer[] array = (Integer[]) stepsForYear.get("July");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("August")) {
                    Integer[] array = (Integer[]) stepsForYear.get("August");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("September")) {
                    Integer[] array = (Integer[]) stepsForYear.get("September");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("October")) {
                    Integer[] array = (Integer[]) stepsForYear.get("October");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("November")) {
                    Integer[] array = (Integer[]) stepsForYear.get("November");
                    array[dayNumber - 1] = stepCount;
                } else if (monthName.equals("December")) {
                    Integer[] array = (Integer[]) stepsForYear.get("December");
                    array[dayNumber - 1] = stepCount;
                } else {
                    System.out.println("Incorrect month!");
                }
            } else {
                System.out.println("Incorrect day!");
            }
        } else {
            System.out.println("Incorrect quantity of steps");
        }
    }


}
