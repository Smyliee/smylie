import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Map_Serialization_Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1 ,"Mango");
        map1.put(2,"apple");
        map1.put(3,"Grapes");
        FileOutputStream foutstream = new FileOutputStream("Map.txt");
        ObjectOutputStream streamOut = new ObjectOutputStream(foutstream);
        streamOut.writeObject(map1);
        foutstream.close();

        FileInputStream finstream = new FileInputStream("Map.txt");
        ObjectInputStream streamin = new ObjectInputStream(finstream);
        Map M = (Map) streamin.readObject();
        String z = M.toString();
        System.out.println(z);

    }
}
