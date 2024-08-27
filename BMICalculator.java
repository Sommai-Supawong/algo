import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        int weight = 50;
        double height = 1.64;
        double BMI =  weight / (height * height);
        System.out.println("Enter your weight in kilograms:" +weight);
        System.out.println("Enter your weight in meters:" +height);
        System.out.println("Your BMI for weight = "+weight +" kg. and height = " +height +" meters is: " +BMI +" bmi.");
        scanner.close();
    }
    
}
