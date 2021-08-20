package DSA460;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        int count = 0 ;
        for(int i=0;i<b.length;i++){
            if(hs.contains(b[i])){
                count++;
                hs.remove(b[i]);
            }
        }
        System.out.println(count);
    }
}
