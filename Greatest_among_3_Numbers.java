import java.util.Scanner;

public class Greatest_among_3_Numbers {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        System.out.println("This program will tell you greatest of the three numbers:");
        System.out.print("Enter first number: ");
        int num1 = val.nextInt();
        System.out.print("Enter second number: ");
        int num2 = val.nextInt();
        System.out.print("Enter third number: ");
        int num3 = val.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("First number is greater, that is: " + num1);
        }else if (num2 >= num3){
            System.out.println("Second number is greater, that is: " + num2);
        }else {
            System.out.println("Third number is greater, that is: " + num3);
        }
    }
}

