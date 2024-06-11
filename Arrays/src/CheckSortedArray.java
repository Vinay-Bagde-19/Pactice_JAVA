public class CheckSortedArray {
    public static void main(String[] args) {
        int[] array = ArrayInputUtility.inputArray();
        boolean isInc = isIncreasing(array);
        boolean isDec = isDecreasing(array);
        if (isInc || isDec){
            System.out.println("The given array is sorted.");
        }else {
            System.out.println("The give array is not sorted.");
        }
    }

    public static boolean isIncreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if (array[i] < array[i-1]){
                return false;
            }
                i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if (array[i] > array[i-1]){
                return false;
            }
                i++;
        }
        return true;
    }
}
