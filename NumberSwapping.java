import java.util.Scanner;
public class NumberSwapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
            int Number1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
            int Number2 = sc.nextInt();
        System.out.println("Current -> number 1 = " + Number1 +"and number 2 = " + Number2);
            
            int temp = Number1 ;
            Number1 = Number2 ;
            Number2 = temp ;
        
        System.out.println("Now -> number 1  = " + Number1 +"and number 2  = " + Number2);
        sc.close();
    }   

}
