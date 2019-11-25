import java.util.Date;

public class Student {
    private String StudentName;
    private int StudentAge;
    private Date StudentBirthDate;

    public Student(String name, int age, Date asdasd){
            this.StudentName = name;
            this.StudentAge = age;
        this.StudentBirthDate =asdasd;
    }
    public boolean IsStudentTest(){
        if(true)
            return true;
        return false;
    }
    public void SayHello(){
        System.out.println("Hello");
    }
}
