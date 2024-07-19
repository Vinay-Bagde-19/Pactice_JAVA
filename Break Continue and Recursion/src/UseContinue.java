import java.util.Scanner;

public class UseContinue {
    public static int SumOfPositive(int[] arr) {
        int sum= 0;
        for (int num : arr) {
            if (num < 0) {
                continue;
            }
            sum = sum + num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculating the Sum of all positive values in an Array....");
        System.out.print("Enter the Size of Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];

        // Input the values in the Array
        for (int i = 0;i < arr.length;i++){
            System.out.print("Enter the "+ (i+1)+" element: ");
            arr[i] = input.nextInt();
        }

        int Sum = SumOfPositive(arr);
        System.out.println("The Sum of all Positive Numbers of the given Array is : " + Sum);
    }
}
