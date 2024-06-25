import java.util.Scanner;

public class MaxInArrayUsingForEach {
    public static int MaxOfArray(int[] arr){
//        if (arr.length == 0){
//        return 0;
//        }else {
           int max = Integer.MIN_VALUE;
           for(int num:arr){
               if (max < num){
                   max = num;
               }
           }
           return max;
//        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing the Maximum value in an integer array....");
        System.out.print("Enter the Size of Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];

        // Input the values in the Array
        for (int i = 0;i < arr.length;i++){
            System.out.print("Enter the "+ (i+1)+" element: ");
            arr[i] = input.nextInt();
        }

        int max = MaxOfArray(arr);
        System.out.println("The Max value is "+ max);
    }
}
