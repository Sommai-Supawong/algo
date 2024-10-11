import java.util.Scanner;
public class Score 
{   public static void main(String[] args) 
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter your midtrem score");
        int Midtrem = sc.nextInt();
        System.out.println("Enter your final score");
        int Final = sc.nextInt();
        int Total = Midtrem + Final;
        System.out.println("Enter your midtrem score: " +Midtrem);
        System.out.println("Enter your final score: " +Final);
            if(Total > 50 )
        {
            System.out.println("Your total score is " +Total +" The result is Pass!!");
        }
            else
        {
             System.out.println("Your total score is " +Total +" The result is Fail!!");
         }
        sc.close();
    }
    
}
