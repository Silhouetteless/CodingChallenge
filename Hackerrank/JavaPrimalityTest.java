import java.util.Scanner; 
import java.math.BigInteger; 


public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        BigInteger n = scan.nextBigInteger();
        
        //This method returns true if this BigInteger is probably prime, false if it's definitely composite.
        //If certainty is <= 0, true is returned.
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
      
        scan.close();
    }
}
