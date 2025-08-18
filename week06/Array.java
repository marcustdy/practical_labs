
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] arr = new double[5];

        for (int i = 1; i < 5; i++) {
            System.out.println("Enter Number: ");
            arr[i] = input.nextInt();
        }

        System.out.println("\nDisplaying all values of the array...");

        for (double i : arr) {
            System.out.println(i);
        }
    }
}
