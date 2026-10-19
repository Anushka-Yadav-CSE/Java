// A program to reverse a token and count its vowels and characters.
import java.util.*;
public class RevToken {
    public static void main (String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            char ch;
            int v = 0;
            String rev = " ";
            System.out.print("Enter a word: ");
            String st = in.next();
            int l = st.length();
            for (int i = l-1; i >= 0; i--) {
                ch = st.charAt(i);
                rev = rev + ch;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    v = v + 1;
                }
            }
            System.out.println("Number of Vowels: " + v);
            System.out.println("Number of Characters: " + l);
            System.out.println("Reversed Token: " + rev);
        }
    }
}
