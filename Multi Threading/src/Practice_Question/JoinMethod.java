package Practice_Question;

public class JoinMethod extends Thread{

    private final int threadNum;

    public JoinMethod(int threadNum){
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread Starting - %d\n", Thread.currentThread().getName(), threadNum);

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended - %d\n", Thread.currentThread().getName(), threadNum);
    }
}
