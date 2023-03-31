import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Student implements Serializable {
    String name ;
    int rollNo;
    ArrayList<String> subjects ;
    public Student(String name , int rollNo,ArrayList subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", subjects=" + subjects +
                '}';
    }
}
