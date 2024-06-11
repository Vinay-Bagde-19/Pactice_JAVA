public class ArrayIsPalindrome {
    public static void main(String[] args) {
        System.out.println("Program fo checking if the given Array is Palindrome or Not....");
        int[] arr = ArrayInputUtility.inputArray();
        boolean isPalindrome = isPalindrome(arr);
        if (isPalindrome) {
            System.out.println("The given Array is Palindrome. ");
        }else {
            System.out.println("The given Array is not Palindrome.");
        }
    }

    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while (i < arr.length/2){
            if (arr[i] != arr[(arr.length - 1) - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
