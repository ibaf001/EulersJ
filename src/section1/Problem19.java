package section1;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ibo on 4/12/17.
 */
public class Problem19 {

    public static boolean isLeapYear(int year){
        boolean isLeap;
        isLeap = (year % 4 == 0);
        isLeap = isLeap && (year % 100 != 0);
        isLeap = isLeap || (year % 400 == 0);
        return isLeap;

    }

    public static void main(String[] args) {
        Map<Integer, Integer> dict = new HashMap<>();
        dict.put(1,31);
        dict.put(2,28);
        dict.put(3,31);
        dict.put(4,30);
        dict.put(5,31);
        dict.put(6,30);
        dict.put(7,31);
        dict.put(8,31);
        dict.put(9,30);
        dict.put(10,31);
        dict.put(11,30);
        dict.put(12,31);
        int day = 7;
        int month = 1;
        int year = 1900;
        int count = 0;
        Instant start = Instant.now();
        while (year < 2001){
            day += 7;
            if(day > dict.get(month)){
                if (month == 2){

                    if (isLeapYear(year)){
                        if (day > dict.get(month)+1){
                            day = day - (dict.get(month)+1);
                            month ++;
                        }

                    }else {
                        day = day - dict.get(month);
                        month++;
                    }

                }else if (month == 12){
                    day = day - dict.get(month);
                    month = 1;
                    year += 1;

                }else {
                    day = day - dict.get(month);
                    month += 1;

                }
            }

           // System.out.println(day+" / "+month+" / "+year);
            if(day == 1 && year > 1900){
                count++;

            }
        }

        System.out.println("count = "+count);
        Instant end = Instant.now();

        Duration elapsed = Duration.between(start,end);
        System.out.println("elapsed : "+elapsed.toMillis()+" millisecond(s)");


    }
}
