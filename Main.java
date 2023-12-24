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

    public static boolean isEnoughZeros(String str, int zeros) {
        int iter = 0;
        while(str.charAt(iter) == '0') { iter++; }
        if(iter >= zeros) { return true; }
        else { return false; }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String strToHash = "Alexey";

        BigInteger iter = new BigInteger("0");

        while(!isEnoughZeros(strToSHA256(strToHash + String.valueOf(iter)), 1)) {
            iter.add(BigInteger.ONE);
            //System.out.println(strToHash + String.valueOf(iter) + "-" + String.valueOf(iter) + "-" + strToSHA256(strToHash + String.valueOf(iter)));
        }

        System.out.println(strToHash + String.valueOf(iter) + "-" + strToSHA256(strToHash + String.valueOf(iter)));
    }
}