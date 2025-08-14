import java.util.Scanner;

public class Calculator{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    
    int[] nums = new int[4];
    int sum = 0;


    // System.out.println("Enter First Number");
    // nums[0] = input.nextInt();

    // System.out.println("Enter Second Number");
    // nums[1] = input.nextInt();

    // System.out.println("Enter Third Number");
    // nums[2] = input.nextInt();

    // System.out.println("Enter Fourth Number");
    // nums[3] = input.nextInt();

    // for (int i = 0 ; i < nums.length ; i++){
    //   sum += nums[i];
    // }

    // System.out.println("The total sum of numbers 1 to 4 is: "+sum+"");
    // input.close();



    int arraySize = 0;

    System.out.println("Enter amount of numbers you want to add: ");
    arraySize = input.nextInt();
    int[] nums2 = new int[arraySize];
    System.out.println("\nList for numbers created. "+nums2.length+"\n ");

    for (int i = 0 ; i < nums2.length ; i++){
      System.out.println("Enter Number");
      nums2[i] = input.nextInt();
    }

    for (int i = 0 ; i < nums2.length ; i++){
      sum += nums2[i];
    }
    System.out.println("\nThe total sum of numbers 1 to "+nums2.length+" is: "+sum+"");
    input.close();
  }
  
}
