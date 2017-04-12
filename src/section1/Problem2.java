package section1;

/**
 * Created by ibo on 4/11/17.
 */
public class Problem2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int tmp = 0;
        int somme = 0;
        while(b < 4000000){
            //System.out.print(b+" ");
            if(b % 2 == 0){
                somme += b;
            }
            tmp = b;
            b += a;
            a = tmp;
        }

        System.out.println(somme);
    }
}
