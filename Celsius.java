import java.util.Scanner;
public class Celsius {
public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    int mySalary = 2000;
    System.out.print("Enter Fahrenheit dregree:");
    float fahrenheit = scanner .nextFloat();
    float celsius = (fahrenheit - 32) * 5/9;
    double roundedCelsius = Math.round(celsius * 100.0/100.0);
    System.out.println(fahrenheit + "Fahrenheit is equal to" +roundedCelsius +"Celsius.");
    scanner.close();
}
}