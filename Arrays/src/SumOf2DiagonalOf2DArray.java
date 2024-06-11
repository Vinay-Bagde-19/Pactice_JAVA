public interface SumOf2DiagonalOf2DArray {
    public static void main(String[] args) {
        int[][] arr =ArrayInputUtility.input2DArray();
        long sum = sumOfDiagonal(arr);
        System.out.println("The sum of the Diagonals of a 2D Array is : " + sum);
    }

    public static long sumOfDiagonal(int[][] arr){
        long leftSum = sumOfLeftDiagonal(arr);
        long rightSum = sumOfRightDiagonal(arr);
        long sum = leftSum + rightSum;
        if (arr.length % 2 != 0){
            int ind = arr.length / 2;
            sum = sum - arr[ind][ind];
        }
        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] arr){
        long sumLeftDiagonal = 0;
        int i = 0;
        while (i < arr.length){
            sumLeftDiagonal = sumLeftDiagonal + arr[i][i];
            i++;
        }
        return sumLeftDiagonal;
    }

    public static long sumOfRightDiagonal(int[][] arr){
        long sumRightDiagonal = 0;
        int i = 0;
        while (i < arr.length){
            int col = (arr.length - 1) - i;
            sumRightDiagonal = sumRightDiagonal + arr[i][col];
            i++;
        }
        return sumRightDiagonal;
    }
}
