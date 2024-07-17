package Question3;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[] {10,20,40,50,30});
        ArrayOperations.Statistics stat = opr.new Statistics();
        System.out.println(stat.mean());
        System.out.println(stat.median());
    }
}
