import java.util.HashMap;

public class StepTracker {

    HashMap<Integer, Integer[]> monthToData = new HashMap <>();
    String[] namesOfMonths = new String[12];
    int goalStep = 10_000;

    public void setNamesOfMonths(String[] namesOfMonths) {
        namesOfMonths[0] = "January";
        namesOfMonths[1] = "February";
        namesOfMonths[2] = "March";
        namesOfMonths[3] = "April";
        namesOfMonths[4] = "May";
        namesOfMonths[5] = "June";
        namesOfMonths[6] = "July";
        namesOfMonths[7] = "August";
        namesOfMonths[8] = "September";
        namesOfMonths[9] = "October";
        namesOfMonths[10] = "November";
        namesOfMonths[11] = "December";
    }
    public Integer[] createData() {
        Integer[] data = new Integer[30];
        for (int i = 0; i < 30; i++) {
            data[i] = 0;
        }
        return data;
    }
    public StepTracker() {
        setNamesOfMonths(namesOfMonths);
        for (int i = 1; i <= 12; i++) {
            monthToData.put(i, createData());
        }
    }

    public boolean checkData(int day, String monthName, int stepsQuan) {
        if (day >= 1 && day <= 30) {
            if (monthName.equals("January") || monthName.equals("February") || monthName.equals("March") ||
                monthName.equals("April") || monthName.equals("May") || monthName.equals("June") ||
                    monthName.equals("July") || monthName.equals("August") || monthName.equals("September") ||
                    monthName.equals("October") || monthName.equals("November") || monthName.equals("December")) {
                if (stepsQuan >= 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public void changeData(int day, String monthName, int stepsQuan, HashMap<Integer, Integer[]> monthToData) {

        int monthNum = 0;

        for (int i = 0; i < 12; i++) {
            if (monthName.equals(namesOfMonths[i])) {
                monthNum = i + 1;
                break;
            }
        }

        Integer[] dataOfCurMonth = monthToData.get(monthNum);
        dataOfCurMonth[day - 1] = stepsQuan;
    }

    public void getStats() {
        int numberOfMonth = 0;

        for (Integer[] value : monthToData.values()) {
            System.out.print(namesOfMonths[numberOfMonth] + " - ");
            for (int i = 0; i < 30; i++) {
                System.out.print(value[i] + " ");
            }
            numberOfMonth++;
            System.out.println();
        }

    }

    public void getMonth(String monthName) {
        int monthNum = 0;
        for (int i = 0; i < 12; i++) {
            if (monthName.equals(namesOfMonths[i])) {
                monthNum = i + 1;
            }
        }
        if (monthNum == 0) {
            System.out.println("Incorrect month");
        } else {
            System.out.println(monthName + " - ");
            int cnt = 1;
            for (Integer i : monthToData.get(monthNum)) {
                System.out.println(cnt + " день: " + i);
                cnt++;
            }
            System.out.println();
        }
    }

    public void changeGoal(int steps) {
        goalStep = steps;
    }

    public int printGoal() {
        return goalStep;
    }

}
