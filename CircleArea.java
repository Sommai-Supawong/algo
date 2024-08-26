import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = 5;
        double CircleArea = (3.14159 * radius * radius) ;
    System.out.println("radius = " + radius);
    System.out.println("Area of circle that has radius = " +radius 
    +" maters is " +CircleArea + "squar meters" );
       scanner.close();
    }
    
}
