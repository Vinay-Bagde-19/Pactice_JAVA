package Practice_Question;

public class TwoThreads extends Thread {

    private final int threadnum;

    public TwoThreads(int threadnum){
        this.threadnum = threadnum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("(%d) Hello from Thread- %d\n",i ,threadnum);
        }
    }
}
