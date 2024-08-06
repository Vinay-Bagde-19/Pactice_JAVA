package Practice_Question;

public class TestingThreadState {
    public static void main(String[] args) throws InterruptedException{
        ThreadStates t1 = new ThreadStates();

        System.out.printf("Create the thread %s\n", t1.getState());
        t1.start();
        t1.join();
        System.out.printf("Thread finished %s\n", t1.getState());
    }
}
