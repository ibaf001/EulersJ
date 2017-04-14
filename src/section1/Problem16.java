package section1;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;


public class Problem16 {

    public static int sumDigits(String num){
        int somme = 0;
        for (int i = 0; i < num.length(); i++) {
            somme += Character.getNumericValue(num.charAt(i));

        }
        return somme;
    }

    public static void main(String[] args) {

        Instant start = Instant.now();

        BigInteger num = new BigInteger("2");
        num = num.pow(1000);
        System.out.println(sumDigits(num.toString()));

        Instant end = Instant.now();

        Duration elapsed = Duration.between(start,end);
        System.out.println("elapsed : "+elapsed.toMillis()+" millisecond(s)");

    }
}
