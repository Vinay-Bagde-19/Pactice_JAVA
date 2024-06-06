import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Simple Interest....");
        System.out.print("Please enter Principal amount: ");
        int P = input.nextInt();
        System.out.print("Please enter Time : ");
        double T = input.nextDouble();
        System.out.print("Please enter Rate : ");
        double R = input.nextDouble();

        double SI = (P*T*R)/100;
        System.out.println("Simple Tnterest is Rs. : " + SI);
    }
}
