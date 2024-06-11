public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = ArrayInputUtility.inputArray();
        reverse(arr);
        System.out.println("Your Reversed array is : ");
        ArrayDisplayUtility.displayArray(arr);
    }

    public static void reverse(int[] arr){
        int i = 0;
        while (i < arr.length / 2) {
             int swap = arr[i];
             arr[i] = arr[(arr.length - 1) - i];
             arr[(arr.length - 1) - i] = swap;
             i++;
        }
    }
}
