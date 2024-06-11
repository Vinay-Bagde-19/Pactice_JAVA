public class SumAverageOf2DArray {
    public static void main(String[] args) {
        int[][] arr = ArrayInputUtility.input2DArray();;
        int sum = sumOf2DArray(arr);
        float avg = avgOf2DArray(arr);
        System.out.println("The sum of the given 2D Array is : " + sum);
        System.out.println("The Average of the given 2D Array is : " +avg);
    }

    public static int sumOf2DArray(int[][] arr){
        int sum = 0;
        int i=0;
        while (i < arr.length){
            int j=0;
            while (j < arr[i].length){
                sum = sum + arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static float avgOf2DArray(int[][] arr){
        if (arr.length == 0){
            return 0;
        }
         int i=0, j=0;
         float noElements = arr[i].length * arr[j].length;
         int sum = sumOf2DArray(arr);
         float avg = sum / noElements;
         return avg;
    }
}
