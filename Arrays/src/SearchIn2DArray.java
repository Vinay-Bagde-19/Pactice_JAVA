import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = ArrayInputUtility.input2DArray();
        System.out.print("Enter the value to Search for : ");
        int num = input.nextInt();
        boolean isFound = search(arr, num);
        if (isFound){
            System.out.println("Your number was found.");
        }else {
            System.out.println("Your number was not found.");
        }
    }

    public static boolean search(int[][] arr, int num){
        int i=0;
        while (i < arr.length){
            int j=0;
            while (j < arr[i].length){
                if (arr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
