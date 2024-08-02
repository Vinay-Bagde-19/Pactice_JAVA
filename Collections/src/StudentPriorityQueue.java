import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " : " + grade;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getGrade() - student2.getGrade();
            }
        });

        queue.offer(new Student("Vinay", 'A'));
        queue.offer(new Student("Ashhad", 'C'));
        queue.offer(new Student("Sanchit", 'D'));
        queue.offer(new Student("Sumit", 'C'));
        queue.offer(new Student("Kunal", 'B'));

        System.out.printf("Queue is : %s \n", queue);  // this will give us current state

        // But to check the Priority Queue we have to poll element one by one which show's the sequence of the queue
        System.out.printf("Got %s \n", queue.poll());
        System.out.printf("Got %s \n", queue.poll());
        System.out.printf("Got %s \n", queue.poll());
        System.out.printf("Got %s \n", queue.poll());
        System.out.printf("Got %s \n", queue.poll());
    }
}
