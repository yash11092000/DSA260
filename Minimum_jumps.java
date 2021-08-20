package DSA460;

public class Minimum_jumps {
    public static void main(String[] args) {
        int a[] = {1, 4, 3, 2, 6, 7} ;
        int N = 6;
        int count = 0;
        int i = 0;
        int j = 0;

        while (i<=N){
            count++;
            i += a[i];

        }
        System.out.println(count);
    }
}
