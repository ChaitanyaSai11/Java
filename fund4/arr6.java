package fund4;

public class arr6 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}