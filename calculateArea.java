import java.util.*;

public class calculateArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius to calculate the area");
        double radius = scan.nextDouble();
        radius = ((radius * radius) * Math.PI);
        System.out.println("The area of the circle is " + radius);

    }
}
