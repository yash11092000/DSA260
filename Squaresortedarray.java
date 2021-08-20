package DSA460;

import java.util.Arrays;

public class Squaresortedarray {
    public static void main(String[] args) {
        int a[] = {-6,-4,1,2,3,5};
        int b[] = new int[a.length];
        int i=0,j=a.length-1;
        for(int k=a.length-1;k>=0;k--){
            if(Math.abs(a[i])>a[j]){
                b[k] = a[i]*a[i];
                i++;
            }
            else{
                b[k] = a[j]*a[j];
                j--;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
