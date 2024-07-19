import java.util.Scanner;

class FibonacciSeriesRecursion {
    public static int Fibonacci(int position){
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return Fibonacci(position - 1) + Fibonacci(position - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Printing the Fibonacci Series Using Recursion...");
        System.out.print("Enter the number of digits you want to print in F.S. : ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
