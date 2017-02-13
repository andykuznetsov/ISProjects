package lab1;

import java.util.Scanner;

public class VigenereDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        System.out.println("Enter key: ");
        String key = scanner.nextLine();

        String enc = Vigenere.encode(str, key);
        System.out.println("Encoded string: " + enc);
        System.out.println("Decoded string: " + Vigenere.decode(enc, key));
    }
}
