import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextDouble();
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + (sum / n));
        input.close();
    }
}
