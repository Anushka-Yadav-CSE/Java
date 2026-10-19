// A program to display the tokens after deleting vowels.
import java.util.*;
public class DVowels {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            char ch;
            String st1 = "";
            System.out.print("Enter a word: ");
            String word = in.next();
            int l = word.length();
            for (int i = 0; i < l; i++) {
                ch = word.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    continue;
                }
                st1 = st1 + ch;              
            }
            System.out.println("New Token after deleting vowels = " + st1);
        }
    }
}
