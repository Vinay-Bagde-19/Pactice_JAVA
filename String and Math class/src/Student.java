public class Student {
    int age;
    String name;


    Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student obj1 = new Student(20,"Vinay");
        System.out.println(obj1.toString());
        System.out.println(obj1);  // toString method is default
    }
}
