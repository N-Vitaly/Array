import java.util.Arrays;

public class Array {
    private static int[] RandomArray(int n) {
        System.out.println("\nSource array:");
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) ((Math.random() * 21) - 10);
        }
        System.out.println(Arrays.toString(mas));
        return mas;
    }
    public void zadacha1() {
        int[] arr = RandomArray(20);
        int max_negative = Integer.MIN_VALUE;
        int min_positive = Integer.MAX_VALUE;
        int positive = 0, negative = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < 0) && (max_negative < arr[i])) {
                max_negative = arr[i];
                negative = i;
            }
            if ((arr[i] >= 0) && (min_positive > arr[i])) {
                min_positive = arr[i];
                positive = i;
            }
        }
        System.out.println("Minimal positive: " + min_positive);
        System.out.println("Maximum negative: " + max_negative);
        temp = arr[negative];
        arr[negative] = arr[positive];
        arr[positive] = temp;

        System.out.println("Array after replace:");
        System.out.println(Arrays.toString(arr));
    }

    public void zadacha2() {
        int[] arr = RandomArray(20);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println("Array after replace:");
        System.out.println(Arrays.toString(arr));
    }

    public void zadacha3() {
        int[] arr = RandomArray(20);
        int minimum = arr[0];
        double sum = 0;
        double average = 0;
        double difference;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;

        System.out.println("Minimum: " + minimum);
        System.out.println("Average: " + average);
        System.out.println("Difference: " + (average-minimum));
    }

}
