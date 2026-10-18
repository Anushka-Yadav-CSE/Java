// A program to display the pattern as er the user's choice.
import java.util.*;
public class Pattern25 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a word as token for pattern printing: ");
            String st = in.next();
            int l = st.length();
            System.out.println("1: Pattern in the form of a triangle.");
            System.out.println("2: Pattern in the form of an inverted triangle.");
            System.out.println("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("The Pattern is: ");
                    for (int i = 0; i < l; i++) {
                        for (int j = 0; j <= i; j++) {
                            char ch = st.charAt(j);
                            System.out.print(ch);
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.println("The Pattern is: ");
                    for (int i = l; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            char ch = st.charAt(j);
                            System.out.print(ch);
                        }
                        System.out.println();
                    }
                }
                default -> {
                    System.out.println("Wrong choice!");
                }
            }
        }
    }
}
