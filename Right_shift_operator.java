import java.util.Scanner;

public class Right_shift_operator {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        System.out.println("Showcasing the Right Shift operator...");
        System.out.print("Enter a number: ");
        int num = val.nextInt();
        int result = num >> 2;
        System.out.println("The result is : " + result);
    }
}
