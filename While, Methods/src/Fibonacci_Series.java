import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Showcasing the Fibonacci Series up to a given number...");
        System.out.print("Enter a number : ");
        int num = input.nextInt();
//        int prev = 0, next = 1;
//        int sum = 0;
//
//        if (num == 0){
//            System.out.println("Fibonacci Series is : " + num);
//        } else if (num == 1) {
//            System.out.println("Fibonacci Series is : \n" + 0 + "\n" + num);
//        }else {
//            System.out.println("Fibonacci Series is : \n" + prev);
//            System.out.println(next);
//            while (num-2 > 0){
//                sum = prev + next;
//                System.out.println(sum);
//                prev = next;
//                next = sum;
//                num--;
//            }
//        }

        System.out.println("Here is the Fibonacci Series : ");
        printFibonacci(num);
    }

    public static void printFibonacci(int num){
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int prev = 0, next =1;
        while (prev + next <= num){
            int nextOfNext = prev + next;
            System.out.print(nextOfNext + " ");
            prev = next;
            next = nextOfNext;
        }

    }
}
