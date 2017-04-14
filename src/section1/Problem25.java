package section1;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

/**
 * Created by ibo on 4/14/17.
 * project euler problem 25
 */
public class Problem25 {

    public static void main(String[] args) {
        Instant start = Instant.now();

        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger temp = b;
        int n = 2;
        while (b.toString().length() < 1000){
            temp = b;
            b = a.add(b);
            a = temp;
            n++;
        }

        System.out.println("index = "+n);

        Instant end = Instant.now();

        Duration elapsed = Duration.between(start,end);
        System.out.println("elapsed : "+elapsed.toMillis()+" millisecond(s)");

    }
}
