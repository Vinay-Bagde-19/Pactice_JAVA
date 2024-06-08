import java.util.Scanner;

public class Sum_of_digits_of_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculating the sum off all digits of a integer number ...");
        System.out.print("Enter a number to calculate : ");
        int num = input.nextInt();
        int sum = 0;

        while (num >= 1){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of all digits of " + num + " is : " + sum);
    }
}
