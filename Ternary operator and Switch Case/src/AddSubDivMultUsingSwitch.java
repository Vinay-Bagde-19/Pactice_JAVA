import java.util.Scanner;

public class AddSubDivMultUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Simple Calculator using Switch Case....");
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        System.out.print("Now, enter the Operation : ");
        String caseToPerform = input.next();

        switch (caseToPerform){
            case "+":
                System.out.println("Addition of the numbers.");
                int result = num1 + num2;
                System.out.println("The addition is given as : " + result);
                break;
            case "-":
                System.out.println("Subtraction of the numbers.");
                result = num1 - num2;
                System.out.println("The Subtraction is given as : " + result);
                break;
            case "*":
                System.out.println("Multiplication of the numbers.");
                result = num1 * num2;
                System.out.println("The Multiplication is given as : " + result);
                break;
            case "/":
                System.out.println("Division of the numbers.");
                result = num1 / num2;
                System.out.println("The Division is given as : " + result);
                break;
            default:
                System.out.println("Invaled Operation.");
        }
    }
}
