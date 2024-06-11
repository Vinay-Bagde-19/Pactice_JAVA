public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("Program for Merging Two Sorted Arrays is Sorted manner...");
        int[] arr1 = ArrayInputUtility.inputArray();
        int[] arr2 = ArrayInputUtility.inputArray();
        int[] mergedArr = mergeArr(arr1, arr2);
        ArrayDisplayUtility.displayArray(mergedArr);
    }

    public static int[] mergeArr(int[] arr1, int[] arr2){
        int[] finalArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length){
            if (j == arr2.length ||
                    (i < arr1.length && arr1[i] < arr2[j])){
                finalArr[k] = arr1[i];
                k++;
                i++;
            } else{
                finalArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return finalArr;
    }
}
