package com.exception;
import java.io.*;

import java.io.FileNotFoundException;

public class ReadFile {
    public static void Function() throws FileNotFoundException
    {
        File f1 = new File("C:\\Users\\Smylie\\Documents\\VHGVHJ.txt");
        BufferedReader newfile = new BufferedReader(new FileReader(f1));

        throw new FileNotFoundException("File is Missing ");

    }
public static void main(String [] args){

        try {
            Function();
        }
        catch (FileNotFoundException E){

            E.printStackTrace();
        }

}


}
