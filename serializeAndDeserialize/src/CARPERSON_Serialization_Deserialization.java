import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CARPERSON_Serialization_Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("raman ", 43, "jalandhar ");

        Person p2 = new Person("ishita", 39, " tamil nadu");


        Car c1 = new Car("TATA", "PENTS", 2009, p1);
        Car c2 = new Car("Maruti Suzuki", "hero honda", 2010, p2);
        ArrayList<Car> Cars = new ArrayList<Car>();
        Cars.add(c1);
        Cars.add(c2);

        FileOutputStream foutstream = new FileOutputStream("Cars.txt");
        ObjectOutputStream streamOut = new ObjectOutputStream(foutstream);
        streamOut.writeObject(Cars);
        foutstream.close();

//       0
    }
}
