import java.util.Scanner;

public class Sum_of_odd_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number till which you want to add, only odd numbers ... : ");
        int num = input.nextInt();
        int sum = odd_sum(num);
        System.out.print("The sum of all odd numbers from 1 to " + num + " are : " + sum);
    }

    public static int odd_sum(int num){
        int i = 1, sum = 0;

        while (i <= num){
            sum = sum + i;
            i += 2;
        }
        return sum;
    }
}
