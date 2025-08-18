
import java.util.Random;
import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Array for Numbers
        int[] nums = new int[50];
        int option = 0;

        // Generate random numbers for array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100);
        }

        // Initialise highest and lowest number varaibles
        int highestNum = nums[0];
        int lowestNum = nums[0];

        // Iterate through array for highest and lowest number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highestNum) {
                highestNum = nums[i];
            } else if (nums[i] < lowestNum) {
                lowestNum = nums[0];
            }
        }
        // Display Highest and Lowest number
        System.out.printf("Highest Number: %d\nLowest Number: %d", highestNum, lowestNum);

        // Menu for displaying Array fowards and backwards
        while (option != 3) {
            System.out.println("\n1. Display Array Forwards\n2. Display Array Backwards\n3. Don't Display");
            option = input.nextInt();

            if (option == 1) {
                for (int i = 0; i < nums.length; i++) {
                    System.out.println(nums[i]);
                }
            } else if (option == 2) {
                for (int i = nums.length - 1; i > 0; i--) {
                    System.out.println(nums[i]);
                }
            }
        }

        // Initialise Even and Odd Numbers
        int evenNums = 0;
        int oddNums = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNums++;
            } else {
                oddNums++;
            }
        }

        System.out.printf("Odd Numbers: %d\nEven Numbers: %d", evenNums, oddNums);
    }
}
