

public class CaesarCipher implements com.company.Cipher {
    @Override
    public String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (char charac : text.toCharArray()) {
            if (Character.isLetter(charac)) {
                int base = Character.isLowerCase(charac) ? 'a' : 'A';
                char encryptedChar = (char) ((charac - base + shift) % 26 + base);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(charac);
            }
        }
        return encryptedText.toString();
    }

    public String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }
}
