import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CARPERSON_Serialization_Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException ,NullPointerException {
//        Person p1 = new Person("raman ", 43, "jalandhar ");
//
//        Person p2 = new Person("ishita", 39, " tamil nadu");


//        Car c1 = new Car("TATA", "PENTS", 2009, p1);
//        Car c2 = new Car("Maruti Suzuki", "hero honda", 2010, p2);
//        ArrayList<Car> Cars = new ArrayList<Car>();
//        Cars.add(c1);
//        Cars.add(c2);

        Car c = new Car("Tata","Pents",2009,new Person("Kirti" ,43 , "jalandhar"));
        Car c2 = new Car("Tata","Pents",2009,new Person("Kirti" ,43 , "jalandhar"));

        List <Car> l = new ArrayList<>();
        l.add(c);
        l.add(c2);
        FileOutputStream foutstream = new FileOutputStream("Cars.txt");
        ObjectOutputStream streamOut = new ObjectOutputStream(foutstream);
        streamOut.writeObject(l);
        streamOut.flush();
        foutstream.close();


        FileInputStream finstream = new FileInputStream("Cars.txt");
        ObjectInputStream streamin = new ObjectInputStream(finstream);
        List<Car> C = (List<Car>) streamin.readObject();
        for(Car in : C){
            System.out.println(in.maker + " " + " " + in.model + " " + in.year);
            Person p = (Person) in.owner;
            System.out.println("The person is " + p.name + " and the age is " + p.age + " and ADDRESS " + p.address);
        }
        //String z = C.toString();
        System.out.println("In the end Nothing ");

//
    }
}
