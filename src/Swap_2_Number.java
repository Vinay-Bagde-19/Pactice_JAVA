import java.util.Scanner;

public class Swap_2_Number {

    // program to swap two numbers
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter two numbers");
            int Num1 = input.nextInt();
            int Num2 = input.nextInt();
            System.out.println("Num1 before Swaping: " + Num1 + "\n Num2 before swaping: " + Num2);

            int Num3 = Num1;
            Num1 = Num2;
            Num2 = Num3;

            System.out.println("Num1 after Swaping: " + Num1 + "\n Num2 after swaping: " + Num2);

        }
    }

