import java.io.*;
import java.util.Date;

public class Employe_Serialization_Deserialization {
    public static  void main  (String[] args) throws IOException ,ClassNotFoundException{
        Date d1 = new Date();

        Employee e1 = new Employee("RAMAN" , 65 , 90000d ,d1);
        FileOutputStream foutstream = new FileOutputStream("abc.txt");
        ObjectOutputStream streamOut = new ObjectOutputStream(foutstream);
        streamOut.writeObject(e1);
        foutstream.close();

        FileInputStream finstream = new FileInputStream("abc.txt");
        ObjectInputStream streamin = new ObjectInputStream(finstream);
        Employee E = (Employee) streamin.readObject();
        String z = E.toString();
        System.out.println(z);

    }
}
