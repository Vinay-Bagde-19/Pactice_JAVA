package Thread_Class;

public class ThirdTask extends Thread{     //extends preDefined Thread Class

    @Override
    public void run() {
        //Third task
        for (int i = 1; i <=1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n%s $ task complete", Thread.currentThread().getName());
    }
}
