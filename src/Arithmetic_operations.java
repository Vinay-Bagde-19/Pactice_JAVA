import java.util.Scanner;

public class Arithmetic_operations {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        int num1,num2,add,sub,div,multi,mod;
        System.out.println("Enter two nummbers for operations; ");
        num1 = val.nextInt();
        num2 = val.nextInt();

        add = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        System.out.println("Nummbers you entered are :" + num1 + ", " +num2);
        System.out.println("Addition is: " + add);
        System.out.println("Substraction is: " + sub);
        System.out.println("Multiplication is; " + multi);
        System.out.println("Division is : " + div);
        System.out.println("Modulus is : " + mod);
    }
}
