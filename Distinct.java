package DSA460;

import java.util.HashSet;

public class Distinct {
    public static void main(String[] args) {
        int a[] = {5,10,15,5,4,5};
//        int count = 0;
//        for(int i=0;i<a.length;i++){
//            int flag = 0;
//            for(int j=0;j<i;j++){
//                if(a[i] == a[j] && i!=j){
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
        HashSet<Integer> hs = new HashSet<>();
        for(int i:a){
         hs.add(i);
        }
        System.out.println(hs.size());
    }
}
