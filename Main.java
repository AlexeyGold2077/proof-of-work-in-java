import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String strToHash = "Alexey lost 10k :)";
        
        HashBox hasher = new HashBox();

        System.out.println(hasher.strToSHA256(strToHash));
    }
}