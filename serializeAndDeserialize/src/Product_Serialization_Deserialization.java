import java.io.*;
import java.util.*;

public class Product_Serialization_Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException ,NullPointerException {
        Product p1 = new Product(1, "Fruits", 1500d);
        Product p2 = new Product(2, "Vegetables", 500);
        List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);


        FileOutputStream foutstream = new FileOutputStream("Product.txt");
        ObjectOutputStream streamOut = new ObjectOutputStream(foutstream);
        streamOut.writeObject(list);
        streamOut.flush();
        foutstream.close();


        FileInputStream finstream = new FileInputStream("Product.txt");
        ObjectInputStream streamin = new ObjectInputStream(finstream);
        List<Product> C = (List<Product>) streamin.readObject();
        for (Product in : C) {
            System.out.println(in.id + " " + " " + in.name + " " + in.price);
        }

    }}
