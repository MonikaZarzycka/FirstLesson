package FilesTasks;

public class DivisibilityByThree {

    public static void divisibility(int[] values) {
        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(value + " <- This is not divisible by three ");
                continue;
            }
            int result = value / 3;
            System.out.println(value + "/3= " + result);
        }


    }
}
