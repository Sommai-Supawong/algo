import java.util.Scanner;
public class Testscanner {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.println("คำนวนหาพื้นที่");
    System.out.println("กว้าง");
    int  W = sc.nextInt();
    System.out.println("ยาว");
    int L = sc.nextInt();
    System.out.println("สูง");
    int H = sc.nextInt();
    int sum = W*L*H;
    System.out.println("พื้นที่เท่ากับ "+sum);
        sc.close();
    }
}