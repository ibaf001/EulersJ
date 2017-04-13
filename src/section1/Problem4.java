package section1;


import java.time.Duration;
import java.time.Instant;

public class Problem4 {
    public static boolean isPalindromic(int n){
        String num = Integer.toString(n);
        int size = num.length();
        for (int i = 0; i < size/2 ; i++) {
            if(num.charAt(i) != num.charAt(size-1-i)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Instant start = Instant.now();
        int largest = 0;
        for (int i = 100; i < 1000 ; i++) {
            for (int j = 100; j < 1000; j++) {
                int num = i * j;
                if (isPalindromic(num) && num > largest) {
                    largest = num;
                }

            }
        }

        System.out.println("largest palindromic number is : "+largest);
        Instant end = Instant.now();

        Duration elapsed = Duration.between(start,end);
        System.out.println("elapsed : "+elapsed.toMillis()+" millisecond(s)");
    }
}
