
import java.util.Random;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int i = 3;
        int userAns;
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);

        while (i >= 1) {
            System.out.println("What is " + num1 + " + " + num2 + ": ");
            userAns = input.nextInt();

            if (userAns == num1 + num2) {
                System.out.println("Correct!!");
                break;

            } else if (userAns != num1 + num2) {
                i--;
                System.out.println("You have " + i + " attempts left!!");

                if (i < 1) {
                    System.out.println("The answer was " + (num1 + num2) + "");
                }
            }
        }
    }
}
