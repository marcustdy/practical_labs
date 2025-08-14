
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int deposit, withdraw;

        int balance = 0;
        String menu = "on";
        String option;

        // balance += deposit;
        while (menu.equals("on")) {
            System.out.println("Enter Deposit Amount: ");
            deposit = input.nextInt();
            balance += deposit;

            System.out.println("Enter Withdrawal Amount: ");
            withdraw = input.nextInt();

            if (withdraw > balance + deposit) {
                System.out.println("Sorry, withdrawal is disallowed as it would overspend your account");

            } else if (withdraw == balance - deposit) {
                System.out.println("Poor you, your closing balnce is: " + 0 + "");
            } else if (withdraw <= balance + deposit) {
                balance -= withdraw;
            }

            System.out.println("Closing Balance: " + balance + " ");

            System.out.println("Would you like to exit? ");
            option = input.next().toLowerCase();

            if (option.equals("yes")) {
                menu = "off";
            } else if (option.equals("no")) {
                menu = "on";
            }

        }

    }

}
