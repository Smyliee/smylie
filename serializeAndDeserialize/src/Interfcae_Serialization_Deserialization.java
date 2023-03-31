import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Interfcae_Serialization_Deserialization{

    public static void main(String[] args) throws IOException, ClassNotFoundException {
    HashSet<String> h = new HashSet<>();
    h.add("car");
    h.add("bus");
    h.add("cycle");
    h.add("walk");

        FileOutputStream foutstream = new FileOutputStream("set.txt");
        ObjectOutputStream streamOut = new ObjectOutputStream(foutstream);
        streamOut.writeObject(h);
        foutstream.close();

        FileInputStream finstream = new FileInputStream("set.txt");
        ObjectInputStream streamin = new ObjectInputStream(finstream);
        HashSet M = (HashSet) streamin.readObject();
        String z = M.toString();
        System.out.println(z);

}
}
