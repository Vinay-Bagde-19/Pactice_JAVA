package AnotherWay;

public class SettingPriorityInThread {
        public static void main(String[] args) {
            long startTime = System.currentTimeMillis();
            PrintTask p1 = new PrintTask('*');
            PrintTask p2 = new PrintTask('#');
            PrintTask p3 = new PrintTask('$');

            Thread t1 = new Thread(p1);
            Thread t2 = new Thread(p2);
            Thread t3 = new Thread(p3);
            //Setting Priority in Thread, but it is up-to JVM , if it is followed or not
            t1.setPriority(Thread.NORM_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
            t3.setPriority(Thread.MAX_PRIORITY);
            //Staring threads
            t1.start();
            t2.start();
            t3.start();

            long endTime = System.currentTimeMillis();
            System.out.printf("%s Total time taken: %d",Thread.currentThread().getName() , endTime-startTime);
        }
}
