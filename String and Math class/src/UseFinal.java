public class UseFinal {
    final int studentRoll;

    final String stuName;

    final String dob;

    UseFinal(int rollNo, String Name, String Dob){
        this.studentRoll = rollNo;
        this.stuName = Name;
        this.dob = Dob;
    }

    @Override
    public String toString() {
        return "Student Info : \n" +
                "studentRoll=" + studentRoll +
                ", stuName='" + stuName + '\'' +
                ", dob='" + dob + '\'' +
                '.';
    }

    public static void main(String[] args) {
        UseFinal obj = new UseFinal(201,"Vinay Bagde","19/11/2003");
        System.out.println(obj);
    }
}
