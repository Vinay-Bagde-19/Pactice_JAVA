import java.util.Scanner;

public class Bitwise_Compliment {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        System.out.println("Showcasing the bitwise Compliment operator...");
        System.out.print("Enter a number: ");
        int num = val.nextInt();
        int result = ~num;
        System.out.println("The result is : " + result);
    }
}
