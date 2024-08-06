package Thread_Class;

public class FirstTask extends Thread{     //extends preDefined Thread Class

    @Override
    public void run() {
        //First task
        for (int i = 1; i <=1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.printf("\n%s * task complete", Thread.currentThread().getName());
    }
}
