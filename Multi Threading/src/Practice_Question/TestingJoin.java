package Practice_Question;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException{
        JoinMethod t1 = new JoinMethod(1);
        JoinMethod t2 = new JoinMethod(2);
        JoinMethod t3 = new JoinMethod(3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}
