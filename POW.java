import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class POW {
    public String strToSHA256(String input) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

        byte[] bHash = messageDigest.digest(input.getBytes());

        BigInteger iHash = new BigInteger(1, bHash);

        return iHash.toString(16);
    }
}