import java.util.*;

public class HeadsOrTails {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first decision, you indecisive child!!");
        String line = s.nextLine();
        System.out.println("Enter second decision, you indecisive child!!");
        String line2 = s.nextLine();

        double j = Math.random() * 2;
        if (j < 1) {
            System.out.println(line);
        } else {
            System.out.println(line2);
        }
    }
}
