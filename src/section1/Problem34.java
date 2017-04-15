package section1;

import java.time.Duration;
import java.time.Instant;

public class Problem34 {

    public static int sumOfFactorial(int num){
        int somme = 0;
        int arr[] = {1,1,2,6,24,120,720,5040,40320,362880};
        while(num > 0){
            somme += arr[num % 10];
            num = num / 10;

        }

        return somme;
    }

    public static void main(String[] args) {
        Instant start = Instant.now();
        int n = 3;
        int total = 0;
        while(n < 1000000){
            if(sumOfFactorial(n) == n){
                total += n;
            }
            n++;
        }

        System.out.println("sum of all numbers which are equal to the sum of the factorial of their digits is : "+total);
        Instant end = Instant.now();

        Duration elapsed = Duration.between(start,end);
        System.out.println("elapsed : "+elapsed.toMillis()+" millisecond(s)");
    }
}
