package DSA460;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Second_highest {
    public static void main(String[] args) {
        int a[] = {4,33,90,200,78};
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            pq.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            if(a[i]<pq.peek()){
                pq.poll();
                pq.add(a[i]);
            }
        }
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
        System.out.println(pq.peek());



//        int highest = Integer.MIN_VALUE;
//        int second_highest = Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>highest){
//                second_highest = highest;
//                highest = a[i];
//            }
//        }
//        System.out.println(second_highest+" "+highest );
    }
}
