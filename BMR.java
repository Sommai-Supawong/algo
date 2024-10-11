import java.util.Scanner;
public class BMR {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sex Man or Women?: ");
            char sex = sc.next().charAt(0);
        System.out.print("enter your weight?(cm.):");
            int weight = sc.nextInt();
        System.out.print("enter your height?(kg.):");
            int height = sc.nextInt();
        System.out.print("enter your age?: ");
            int age = sc.nextInt();
            double BMR;
            if(sex ==('M')){
                 BMR = 66+(13.7*weight)+(5*height)-(6.8*age);
                System.out.print("BMR your is: " +BMR);
            }
            else if (sex ==('W')){ 
                 BMR = 655+(9.6*weight)+(1.8*height)-(4.7*age);
                System.out.print("BMR your is: " +BMR);
            }
            else{
                System.out.print("Please enter your sex correctly.");
            }
        sc.close();
    }
    
}
