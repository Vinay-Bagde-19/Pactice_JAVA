import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number to find Factorial: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.println("Factorial using two ways...");
        System.out.println(fact(num));

        // Using Functional Interface
        IntStream.rangeClosed(2,num)
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);
    }

    public static long fact(int num){
            if (num == 0 || num == 1){
                return 1;
            }
            return num * fact(num - 1);
    }
}
