package lab2;

import java.util.Scanner;

public class Task3 {
    public static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = id.nextLine();
        System.out.print("Введите ключ: ");
        int key = id.nextInt();
        text = text.toLowerCase();
        String encryptText = "";
        for (int i = 0; i < text.length(); i++) {
            int pos = ALPHABET.indexOf(text.charAt(i));
            int encryptPos = (key + pos) % 26;
            char encryptChar = ALPHABET.charAt(encryptPos);
            encryptText += encryptChar;
        }
        System.out.println("Текст после преобразования: " + encryptText);
        System.out.print("Выполнить обратное преобразование? (y/n)");
        String reply = id.next();
        if (reply.toLowerCase().equals("y")) {
            String decryptText = "";
            for (int i = 0; i < encryptText.length(); i++) {
                int pos = ALPHABET.indexOf(encryptText.charAt(i));
                int decryptPos = (pos - key) % 26;
                if (decryptPos < 0) {
                    decryptPos = ALPHABET.length() + decryptPos;
                }
                char decryptChar = ALPHABET.charAt(decryptPos);
                decryptText += decryptChar;
            }
            System.out.println(decryptText);
        } else if (reply.toLowerCase().equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }
}
