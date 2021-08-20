package DSA460;


import java.util.Arrays;

public class Kthmax {
    public static void main(String[] args) {
        int a[] = {7,10,4,3,20,15};
        int k = 3;
        for(int i=0;i<k;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
