import java.awt.dnd.DropTarget;
import java.io.*;

public class Rectangle_Serialization_Deserialization {
    public static void main(String [] args) throws IOException, ClassNotFoundException {

        Rectangle rectangle1 = new Rectangle(4 ,7);
        FileOutputStream foutstream= new FileOutputStream("rectangle.txt");
        DataOutputStream streamOut = new DataOutputStream(foutstream);
        streamOut.writeDouble(rectangle1.width);
        streamOut.writeDouble(rectangle1.height);
        foutstream.close();
        streamOut.close();

        FileInputStream finstream = new FileInputStream("rectangle.txt");
        DataInputStream streamin = new DataInputStream(finstream);
        double width = streamin.readDouble();
        double height = streamin.readDouble();
       Rectangle R = new Rectangle(width,height);
        String z = R.toString();
        System.out.println(z);

    }

}
