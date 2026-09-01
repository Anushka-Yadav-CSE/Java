// A program to display the first 10 terms of the series 1, 4, 9, 16,...
public class Series4 {
    public static void main(String[] args) {
        // Using a for loop to iterate from 1 to 10 and print the squares of the numbers.
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i);
            if ( i < 10) {
                System.out.print(", ");
            }
        }
    }
}