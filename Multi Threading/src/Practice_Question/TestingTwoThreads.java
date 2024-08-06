package Practice_Question;

public class TestingTwoThreads {
    public static void main(String[] args) {
        TwoThreads t1 = new TwoThreads(1);
        TwoThreads t2 = new TwoThreads(2);

        t1.start();
        t2.start();
    }
}
