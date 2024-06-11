public class MaxMinOfArray {
    public static void main(String[] args) {
        int[] arr = ArrayInputUtility.inputArray();
        int max = maxOfArray(arr);
        int min = minOfArray(arr);
        System.out.println("The Maximum value in the array is : "+ max);
        System.out.println("The Minimum value in the array is : "+ min);
    }

    public static int maxOfArray(int[] array){
        int max = array[0];
        int i = 1;
        while (i < array.length){
            if (max < array[i]){
                max = array[i];
            }
            i++;
        }
        return max;
    }

    public static int minOfArray(int[] array){
        int min = array[0];
        int i = 1;
        while (i < array.length){
            if (array[i] < min){
                min = array[i];
            }
            i++;
        }
        return min;
    }
}
