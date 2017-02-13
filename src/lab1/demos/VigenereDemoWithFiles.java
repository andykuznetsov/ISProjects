package lab1.demos;

import lab1.FileWorker;
import lab1.ciphers.Vigenere;

import java.io.FileNotFoundException;

public class VigenereDemoWithFiles {
    private static String fileName = "/Users/Andrey/Study/Information Security/ISProjects/src/lab1/in.txt";
    public static void main(String[] args) throws FileNotFoundException {

        String key = "LEMON";

        String textFromFile = FileWorker.read(fileName);

        String enc = Vigenere.encode(textFromFile, key);

        System.out.println("Encoded string: " + enc);
        System.out.println("Decoded string: " + Vigenere.decode(enc, key));
    }
}
