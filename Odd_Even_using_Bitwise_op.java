import java.util.Scanner;

public class Odd_Even_using_Bitwise_op {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        System.out.println("Finding odd or even using Bitwise operator.....");
        System.out.print("Enter a number: ");
        int num = val.nextInt();
        if ((num & 1) == 1){
            System.out.println("The number is odd.");
        }else{
            System.out.println("The number is even");
        }
    }
}
