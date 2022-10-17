public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        int sum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[max] < values[i]) {
                max = i;
            }
            if (values[min] > values[i]) {
                min = i;
            }
        }
        System.out.println("max index: " + max);
        System.out.println("min index: " + min);

            for (int j = min; j < max; j++) {
                sum += values[j];
        }
        System.out.println("Sum:" + sum);
    }
}