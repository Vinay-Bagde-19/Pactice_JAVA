public class Course {
    static int maxCapacity;

    String courseName;
    int enrollment;

    String[] enrolledStudentNames;

    static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
    }

    void enrollStudents(String studentName){
        enrolledStudentNames[enrollment] = studentName;
        enrollment++;
    }

    void unEnrollStudents(String studentName){
        System.out.println("Student removed");
        enrollment--;
    }

    Course(String courseName){
        this.courseName = courseName;
        this.enrollment = 0;
        this.enrolledStudentNames = new String[maxCapacity];
    }
}
