package section1;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

/**
 * Created by ibo on 4/21/17.
 */
public class Problem48 {


   public static BigInteger sumPower(int n){
        BigInteger total = new BigInteger("0");
       for (int i = 1; i <= n ; i++) {
           total = total.add(new BigInteger(Integer.toString(i)).pow(i));
       }
       return total;
   }


    public static void main(String[] args) {
        Instant start = Instant.now();
        String str = sumPower(1000).toString();
        int length = str.length();
        System.out.println(str.substring(length-10, length));


        Instant end = Instant.now();

        Duration elapsed = Duration.between(start,end);
        System.out.println("elapsed : "+elapsed.toMillis()+" millisecond(s)");
    }
}
