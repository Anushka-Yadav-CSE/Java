// A program to compare two tokens lexicographically.
import java.util.*;
public class Compare {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            String st1, st2;
            System.out.println("Enter 2 tokens: ");
            st1 = in.next();
            st2 = in.next();
            if (st1.compareTo(st2) < 0) {
                System.out.println(st1 + " , " + st2);
            }
            if (st2.compareTo(st1) < 0) {
                System.out.println(st2 + " , " + st1);
            }
            if (st1.compareTo(st2) == 0) {
                System.out.println(st1 + " is equal to " + st2);
            }
        }
    }
}
