package lab1.demos;

import lab1.ciphers.Caesar;

import java.util.Scanner;

public class CaesarDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        System.out.println("Enter number: ");
        int k = scanner.nextInt();

        System.out.println("Encoded string: " + Caesar.encode(str, k ));
        System.out.println("Decoded string: " + Caesar.decode(Caesar.encode(str, k), k ));

    }
}
