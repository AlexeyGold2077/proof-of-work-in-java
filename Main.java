import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String strToHash = "Alexey lost 10k :)";
        
        POW hasher = new POW();

        System.out.println(hasher.strToSHA256(strToHash));
    }
}