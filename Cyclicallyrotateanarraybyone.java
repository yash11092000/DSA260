package DSA460;

import java.util.Arrays;

public class Cyclicallyrotateanarraybyone {
    public static void main(String[] args) {
        int a[] = {9, 8, 7, 6, 4, 2, 1, 3};
        int temp = a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i] = a[i-1];
        }
        a[0] = temp;
        System.out.println(Arrays.toString(a));
    }
}
