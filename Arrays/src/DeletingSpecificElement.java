import java.util.Scanner;

public class DeletingSpecificElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = ArrayInputUtility.inputArray();
        System.out.print("Enter the number to be Deleted from Array :");
        int del = input.nextInt();
        int[] newArr = deleteNumber(arr, del);

        System.out.print("The New Array is as follow : ");
        ArrayDisplayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] arr, int del) {
        int occ = OccurrenceOfNumber.occurrence(arr, del);
        //This is Class name      //This is the method name of that Class with parameters
        if (occ == 0) {
            return arr;
        }
        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != del) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
            return newArr;

    }
}
