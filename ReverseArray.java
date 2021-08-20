package DSA460;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String a = "Geeks";
        char c[] = a.toCharArray();
        int i=0,j=c.length-1;
        while(i<j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        String ans = new String(c);
        System.out.println(ans);
    }


}
