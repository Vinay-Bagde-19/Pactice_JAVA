public class SumAverageOfArray {
    public static void main(String[] args) {
        System.out.println("Finding the Sum and Average of a Array ....");
        int[] arr = ArrayInputUtility.inputArray();
        int sum = sumOfElementsOfArray(arr);
        double avgOfArray = sum / arr.length;
        System.out.println("The Sum of the Array is : "+ sum);
        System.out.println("The Average of the Array is : "+ avgOfArray);
    }

    public static int sumOfElementsOfArray(int[] arr){
        int sum = 0, index = 0;
        while (index < arr.length){
            sum = sum + arr[index];
            index++;
        }
        return sum;
    }
}
