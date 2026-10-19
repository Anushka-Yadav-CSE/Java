// A program to count and display the total number of uppercase and lowercase characters in a line.
import java.util.*;
public class ULToken {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            char ch;
            int lc = 0, uc = 0;
            System.out.println("Enter a line: ");
            String st = in.nextLine();
            int l = st.length();
            for (int i = 0; i < l; i++) {
                ch = st.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    lc = lc + 1;
                }
                if (ch >= 'A' && ch <= 'Z') {
                    uc = uc + 1;
                }
            }
            System.out.println("No. of LowerCase Characters: " + lc);
            System.out.println("No. of UpperCase Characters: " + uc);                    
        }
    }
}
