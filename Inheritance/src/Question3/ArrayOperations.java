package Question3;

import java.util.Arrays;

public class ArrayOperations {
    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int num : arr){
                sum += num;
            }
            return sum / arr.length;
        }

        double median(){
           Arrays.sort(arr);
            return arr[arr.length/2];
        }
    }
}
