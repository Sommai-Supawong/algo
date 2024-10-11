import java.util.Scanner;

public class NoteChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ProductPrice to pay: ");
            int ProductPrice = sc.nextInt();
        System.out.print("Enter quantityProduct to pay: ");
            int quantityProduct = sc.nextInt();
            int TotalPrice = ProductPrice * quantityProduct;
        System.out.println("amount to pay is : " + TotalPrice + " Baht");
            int Change = 1000 - TotalPrice;
    
        if (TotalPrice < 1000) {
            System.out.println("Change is : " + Change + " Baht");
            int FiveHundredBaht = Change / 500;
            Change = Change % 500;
            System.out.println("five-hundred note: " + FiveHundredBaht + " note(s)");
            int HundredBaht = Change / 100;
            Change = Change % 100;
            System.out.println("Hundred note: " + HundredBaht + " note(s)");
            int FiftyBaht = Change / 50;
            Change = Change % 50;
            System.out.println("Fifty note: " + FiftyBaht + " note(s)");
            int TwentyBaht = Change / 20;
            Change = Change % 20;
            System.out.println("Twenty note: " + TwentyBaht + " note(s)");
            int TenCoin = Change / 10;
            Change = Change % 10;
            System.out.println("TenCoin note: " + TenCoin + " note(s)");
            int FiveCoin = Change / 5;
            Change = Change % 5;
            System.out.println("FiveCoin note: " + FiveCoin + " note(s)");
            int TwoCoin = Change / 2;
            Change = Change % 2;
            System.out.println("TwoCoin note: " + TwoCoin + " note(s)");
        } else {
            System.out.println("Not enough money!!");
        }
        sc.close();
    }

}
