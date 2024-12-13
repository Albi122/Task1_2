package com.company;

public class Main {
    public static void main(String[] args) {
        com.company.Cipher cipher = (com.company.Cipher) new com.company.CaesarCipher();
        String originalText = "Albina";
        int shift = 4;

        String encryptedText = cipher.encrypt(originalText, shift);
        String decryptedText = cipher.decrypt(encryptedText, shift);

        System.out.println("Исходный текст: " + originalText);
        System.out.println("Зашифрованный текст: " + encryptedText);
        System.out.println("Расшифрованный текст: " + decryptedText);
    }
}
