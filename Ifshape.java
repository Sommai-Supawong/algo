import java.util.Scanner;
public class Ifshape 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number 1 or 2.");
      int number = sc.nextInt();
    if (number == 1)
    {   System.out.println("Enter the base. ");
        int base = sc.nextInt();
        System.out.println("Enter the height. ");
        int height = sc.nextInt();
       double triangle = base * height / 2;
        System.out.println("Enter a number: " +number);
        System.out.println("Enter the base of the triangle: " +base);
        System.out.println("Enter the height of the triangle: " +height);
        System.out.println("Area of the triangle: " +triangle +"square units");
    }
    else if(number ==2)
    {   System.out.println("Enter the Weight.");
        int Weight = sc.nextInt();
        System.out.println("Enter the height.");
        int height = sc.nextInt();
       double BMI = Weight /( height * Weight);
        System.out.println("Enter a number: " +number);
        System.out.println("Enter the Weight in kilograms: " +Weight);
        System.out.println("Enter the height in meters: " +height);
        System.out.println("Your BMI for weight = " +Weight +" kg. and height " +height +" meters. is: " +BMI +"bmi.");
    }
    else 
    {
    System.out.println(" please Enter number 1 or 2");
    }
    sc.close();
    }
}
