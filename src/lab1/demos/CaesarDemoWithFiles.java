package lab1.demos;

import lab1.FileWorker;
import lab1.ciphers.Caesar;

import java.io.FileNotFoundException;

public class CaesarDemoWithFiles {

    private static String fileName = "/Users/Andrey/Study/Information Security/ISProjects/src/lab1/in.txt";

    public static void main(String[] args) throws FileNotFoundException {


        String textFromFile = FileWorker.read(fileName);


        // !!! shift length here !!!
        int k = 2;


        System.out.println("Encoded string: " + Caesar.encode(textFromFile, k ));
        System.out.println("Decoded string: " + Caesar.decode(Caesar.encode(textFromFile, k), k ));
    }


}
