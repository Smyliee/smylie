import java.io.*;
import java.util.ArrayList;

public class Student_Serialization_Deserialization {
    public static  void main  (String[] args) throws IOException, ClassNotFoundException {
        ArrayList subjects = new ArrayList();
        subjects.add("math");
       subjects.add("english");
       subjects.add("Chemistry");

        Student s1 = new Student("RAMAN" , 65 , subjects);
        FileOutputStream foutstream = new FileOutputStream("Student.txt");
        ObjectOutputStream streamOut = new ObjectOutputStream(foutstream);
        streamOut.writeObject(s1);
        foutstream.close();

        FileInputStream finstream = new FileInputStream("Student.txt");
        ObjectInputStream streamin = new ObjectInputStream(finstream);
        Student S = (Student) streamin.readObject();
        String z = S.toString();
        System.out.println(z);
    }
}
