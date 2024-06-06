import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Compound interest ...");

        System.out.print("Please enter Principal amount : ");
        int P = input.nextInt();
        System.out.print("Please enter Time : ");
        double T = input.nextDouble();
        System.out.print("Please enter Rate : ");
        double R = input.nextDouble();

        double CI = P* Math.pow((1+R/100),T);
        System.out.println("Compound interest is Rs : " + CI);
    }
}
