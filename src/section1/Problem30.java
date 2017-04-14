package section1;

import java.time.Duration;
import java.time.Instant;

public class Problem30 {

    public static int sumOfFifth(int num){
        int arr[] = {0,1,32,243,1024,3125,7776,16807,32768,59049};
        int somme = 0;
        while(num > 0){
            somme += arr[num%10];
            num = num / 10;
        }
        return somme;
    }
    public static void main(String[] args) {
        Instant start = Instant.now();
        int total = 0;
        int n = 2;
        while(n < sumOfFifth(99999)){
            if(n == sumOfFifth(n)){
                total += n;
            }
            n++;
        }

        System.out.println(total);

        Instant end = Instant.now();

        Duration elapsed = Duration.between(start,end);
        System.out.println("elapsed : "+elapsed.toMillis()+" millisecond(s)");
    }
}
