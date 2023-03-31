import java.io.Serializable;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.time.LocalDateTime;
import java.util.Date;

public class Employee implements Serializable {
    String name ;
    int age ;
    double salary;
    Date hiringDate;



    public Employee(String name , int age , double salary ,Date hiringDate) {
        this.name = name;
        this.age = age;
        this.salary= salary;
        this.hiringDate=hiringDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hiringDate=" + hiringDate +
                '}';
    }
}
