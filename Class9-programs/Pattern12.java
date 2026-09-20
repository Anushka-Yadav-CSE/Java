// A program to print pattern's as per the user's choice.
import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("1: For Triangle pattern.");
            System.out.println("2: For Inverted-Triangle pattern.");
            System.out.println("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    // The Pattern is: 
                    // *
                    // * #
                    // * # *
                    // * # * #
                    // * # * # *
                    System.out.println("The Pattern is: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            if (j % 2 == 0) {
                                System.out.print("* ");
                            }
                            else {
                                System.out.print("# ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    // The Pattern is: 
                    // 5 4 3 2 1
                    // 4 3 2 1
                    // 3 2 1
                    // 2 1
                    // 1
                    System.out.println("The Pattern is: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                }
                default -> {
                    System.out.println("INVALID CHOICE!!");
                }
            }
        }
    }
}
