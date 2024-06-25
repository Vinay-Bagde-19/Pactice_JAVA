import java.util.Scanner;

public class MultiplicationTableUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ShowCasing the Multiplication Table for a given number Using For Loop....\n");
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
