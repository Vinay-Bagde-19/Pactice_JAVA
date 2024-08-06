package Practice_Question;

public class ThreadStates extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(4000);   // Print next line after 4s
            System.out.printf("From inside run %s\n",Thread.currentThread().getState());
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
