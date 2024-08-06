package AnotherWay;

public class PrintTask implements Runnable{
    @Override
    public void run() {
        //Print task
        for (int i = 1; i <=1000; i++) {
            System.out.printf("%d%c ", i,symbol);
        }
        System.out.printf("\n%s %c task complete", Thread.currentThread().getName(), symbol);
    }

    private final char symbol;

    public PrintTask(char symbol) {
        this.symbol = symbol;
    }
}
