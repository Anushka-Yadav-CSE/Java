// A program to check whether a number is a niven number or not.
import java.util.*;
public class Niven {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      // Input a number from user
      System.out.print("Enter the number: ");
      int num = in.nextInt();
      int sum = 0;
      int a;
      int b = num;
      // do-while loop to calculate the sum of digits of the number.
      do {
        a = num % 10;
        sum = sum + a;
        num = num / 10;
      }
      while (num != 0);  
      // check whether the number is a niven number or not.      
      if (b % sum == 0) {
        System.out.println("The number is a Niven number.");
      }
      else {            
        System.out.println("The number is not a Niven number.");
      }
    }
  }
}