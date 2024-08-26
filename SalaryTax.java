import java.util.Scanner;

public class SalaryTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = 30000;
        int taxRate = 10;
        int salaryTax = (salary * taxRate) /100;
        System.out.println( "เงินเดือน = " +salary );
        System.out.println( "อัตรภาษี = " +taxRate );
        System.out.println( "อัตรภาษีของเงินเดือน = " +salaryTax );
        scanner.close();
    }
    
}
