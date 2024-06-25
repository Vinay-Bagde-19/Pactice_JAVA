import java.util.Scanner;

class OccurrenceOfSpecificElement {
    public static int Occurrence(int[] arr, int val){
        int count = 0;
        for (int num : arr){
            if (num == val){
                count++ ;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Counting the number of Occurrence of a Specific Element in Array....");
        System.out.print("Enter the Size of Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];

        // Input the values in the Array
        for (int i = 0;i < arr.length;i++){
            System.out.print("Enter the "+ (i+1)+" element: ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the value for which you have to check occurrence : ");
        int val = input.nextInt();
        int count = Occurrence(arr, val);
        System.out.println("The Element is present "+ count +" times in the array.");
    }
}
