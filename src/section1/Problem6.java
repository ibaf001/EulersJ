package section1;

/**
 * Created by ibo on 4/12/17.
 */
public class Problem6 {

    public static int sumSquareFirstN(int n){
        int somme = 0;
       // somme = (n*n*n)/3 + (n*n)/2 + n/6;
        somme = n*(n+1)*(2*n+1)/6;
        return somme;
    }

    public static int squareSumFirstN(int n){

        int  somme = n*(n+1)/2;
        return somme * somme;
    }

    public static void main(String[] args) {

        System.out.println(squareSumFirstN(100)- sumSquareFirstN(100));
    }
}
