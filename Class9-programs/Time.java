// A program to convert time in seconds to hours, minutes and seconds.
import java.util.*;
public class Time {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the time in seconds: ");
            int timeSeconds = in.nextInt();
            // Condition
            if (timeSeconds >= 0) {
                int hours = timeSeconds / 3600;
                int remainingSeconds = timeSeconds - (3600 * hours);
                int minutes = remainingSeconds / 60;
                int seconds = remainingSeconds - (60 * minutes);
                // Output
                System.out.println("Time in seconds: " + timeSeconds);
                System.out.println(+ hours + " Hours " + minutes + " Minutes " + seconds + " Seconds ");
            }
            else {
                System.out.println("INVALID INPUT! Time cannot be negative.");
            }
        }
    }
}