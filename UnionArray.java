package DSA460;

import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int a[] = {10,10};
        int b[] = {10};
//        int count = 0;
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<b.length;j++){
//                if(a[i] == b[j]){
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
        HashSet<Integer> hs  = new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            hs.add(b[i]);
        }
        System.out.println(hs.size());
    }
}
