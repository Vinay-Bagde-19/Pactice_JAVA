public class TestingIsPrime {
    public static void main(String[] args) {
        IsPrimeInterface test = num -> {
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        };


        System.out.println(test.isPrime(5));
    }
}
