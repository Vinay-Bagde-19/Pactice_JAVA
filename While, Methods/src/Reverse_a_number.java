import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Showcasing the reverse of a given number... \n");
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int reverse = 0;
        while (num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("The Reverse of " + num + " is : " + reverse);
    }
}
