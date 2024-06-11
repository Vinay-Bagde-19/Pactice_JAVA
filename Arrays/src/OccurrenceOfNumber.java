import java.util.Scanner;

public class OccurrenceOfNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value to count its occurrence in the array : ");
        int num = input.nextInt();
        int[] arr = ArrayInputUtility.inputArray();
        int occur = occurrence(arr,num);
        System.out.println("The given element "+ num + " occurred " + occur +" times in the array.");
    }

    public static int occurrence(int[] arr, int num){
        int count = 0, index = 0;
        while (index < arr.length){
            if (num == arr[index]){
                count++;
            }
            index++;
        }
        return count;
    }
}
