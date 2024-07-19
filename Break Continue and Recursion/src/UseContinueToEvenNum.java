import java.util.Scanner;

public class UseContinueToEvenNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number till which you want to Print only even numbers : ");
        int range = input.nextInt();

        System.out.println("All even number from 1 to "+ range + " are :");
        for (int i = 2; i <= range; i++){
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
