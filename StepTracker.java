import java.util.HashMap;

public class StepTracker {

    HashMap<Integer, Integer[]> monthToData = new HashMap <>();

    public StepTracker() {
        for (int i = 1; i <= 12; i++) {
            monthToData.put(i, createData());
        }
    }

    public void getStats() {
        int numberOfMonth = 1;
        for (Integer[] value : monthToData.values()) {
            System.out.print(numberOfMonth + " - ");
            for (int i = 0; i < 30; i++) {
                System.out.print(value[i] + " ");
            }
            numberOfMonth++;
            System.out.println();
        }
    }
    public Integer[] createData() {
        Integer[] data = new Integer[30];
        for (int i = 0; i < 30; i++) {
            data[i] = 0;
        }
        return data;
    }
}
