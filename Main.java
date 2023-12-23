import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static String strToSHA256(String input) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bHash = messageDigest.digest(input.getBytes());
        BigInteger iHash = new BigInteger(1, bHash);
        return iHash.toString(16);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String strToHash = "Alexey lost 10k :)";

        System.out.println(strToSHA256(strToHash));
    }
}