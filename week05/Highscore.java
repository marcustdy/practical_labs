import java.util.Arrays;
import java.util.Scanner;

public class Highscore{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int studentCount;
    int highestGrade = 0;

    System.out.println("Enter Student Count: ");
    studentCount = input.nextInt();
    int[] studentGrade = new int[studentCount];


    for (int i = 0 ; i < studentCount ; i++){
      System.out.println("Enter Student Grade: ");
      studentGrade[i] = input.nextInt();
      if (studentGrade[i] > highestGrade)
        highestGrade = studentGrade[i];
    }

    System.out.println(("Student Grades: " +Arrays.toString(studentGrade)+ " "));
    System.out.println("Highest Grade: " +highestGrade+ " ");

  }

}