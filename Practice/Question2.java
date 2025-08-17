
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        int limit = 0;

        System.out.println("Enter Limit: ");
        limit = input.nextInt();

        while (i <= limit) {
            System.out.println(i);
            i = i + 3;
        }
    }
}
