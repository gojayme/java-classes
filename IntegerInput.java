import java.io.*;
import java.util.*;

public class IntegerInput {

    public static void main(String[] args) {
        int n = -1;
        Scanner scan = new Scanner(System.in);
        while (n < 0) {
            System.out.println("enter your age");
            try {
                if (scan.hasNextInt())
                    n = scan.nextInt();
                else { // non integer submitted
                    String userInput = scan.next();
                    throw new Exception("Bad input. " + userInput +
                        " is not an integer.  You must input an integer");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("next year you will be " + (n + 1));
    }
}
