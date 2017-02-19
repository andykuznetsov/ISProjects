package lab2;

import lab1.FileWorker;

import javax.crypto.*;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class DES_demo {

    private static String fileName = "/Users/Andrey/Study/Information Security/ISProjects/src/lab2/in.txt";


    public static void main(String[] s) throws IllegalBlockSizeException, BadPaddingException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
        SecretKey key = KeyGenerator.getInstance("DES").generateKey();
        DesEncrypter encrypter = new DesEncrypter(key);
       // String OStr1="simple string";

        String textFromFile = FileWorker.read(fileName);
        System.out.println("Open String:"+textFromFile+
                "\nAfter encrypting: "+ encrypter.encrypt(textFromFile) +"\nAfter decrypting: "+encrypter.decrypt(encrypter.encrypt(textFromFile)));
    }
}
