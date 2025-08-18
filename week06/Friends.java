
import java.util.Scanner;

public class Friends {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] friends = new String[4];
        String nameSearch;

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Friends Name: ");
            friends[i] = input.next();
        }

        for (String i : friends) {
            System.out.println(i);
        }

        System.out.println("Enter name to search for: ");
        nameSearch = input.next();

        for (int i = 0; i < friends.length; i++) {
            if (nameSearch.equals(friends[i])) {
                System.out.println("The name " + nameSearch + " was found at index " + i + "!!");
            }
        }
    }
}
