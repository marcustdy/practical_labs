
import java.util.Scanner;

public class Arraysearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int arrSize, numSearch;

        System.out.println("Enter Array Size: ");
        arrSize = input.nextInt();
        int[] nums = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter a number: ");
            nums[i] = input.nextInt();
        }

        //Display Array
        System.out.println("Display Array...");
        for (int i : nums) {
            System.out.println(i);
        }

        //Search for a number with enhanced For Loop
        System.out.println("Enter a number to search for: ");
        numSearch = input.nextInt();
        int a = 0;
        for (int i : nums) {
            if (nums[a] == numSearch) {
                System.out.println("Number " + nums[a] + " found at index " + a + "");
            }
            a++;
        }

        //assign highestNum and lowestNum with the value nums[0]
        int highestNum = nums[0];
        int lowestNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highestNum) {
                highestNum = nums[i];
            } else if (nums[i] < lowestNum) {
                lowestNum = nums[i];
            }
        }
        System.out.println("Highest Number: " + highestNum + "\nLowest Number: " + lowestNum + "");
    }
}
