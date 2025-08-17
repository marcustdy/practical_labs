
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        int userNum;

        System.out.println("Enter a Number: ");
        userNum = input.nextInt();

        while (i <= 10) {
            if (userNum * i == 21 || userNum * i == 32) {
                System.out.println("You have triggered the forbidden number " + userNum * i + "");
                break;
            } else {
                System.out.println("" + userNum + " x " + i + " = " + userNum * i + "");
                i++;
            }

        }

    }

}
