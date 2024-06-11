import java.util.Scanner;

public class ArrayInputUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Enter the "+ (i+1) + " element of  array : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows of the Array : ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns of the Array : ");
        int col = input.nextInt();
        int[][] arr = new int[rows][col];
        int i = 0;
        while (i < rows){
            int j = 0;
            while (j < col){
                System.out.print("Please enter element of row: " + (i+1) +" , column: " + (j+1) + " : ");
                arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }
}
