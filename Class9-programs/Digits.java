// A program to display all the digits of a 3 digit number.
import java.util.*;
public class Digits {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int number=in.nextInt();
            int a=number/100;
            int b=number/10;
            b=b%10;
            int c=number%10;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}