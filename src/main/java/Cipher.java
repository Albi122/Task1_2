

public interface Cipher {
    String encrypt(String text, int shift);

    String decrypt(String text, int shift);
}
