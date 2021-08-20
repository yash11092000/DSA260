package DSA460;

import java.util.Scanner;

public class LTI_client_and_his_love {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int count = 0;
        while(no!=0){
            if(prime(no) == 1){
                no = no-1;
                count++;
            }
            else{
                no = LCM(no);
                count++;
            }
        }
        System.out.println(count);

    }
    static int prime(int no){
        if(no == 1){
         return 0;
        }
        else if(no == 2){
            return 1;
        }
        else{
            for(int i=2;i<no/2+1;i++){
                if(no%i == 0){
                    return 0;
                }
            }
        }
        return 1;
    }
    static int LCM(int no){
        int p = 0;
        int i = 2;
        while (no!=1){
            if(no%i==0){
                p = i;
                no = no/i;
            }
            else{
                i+=1;
            }
        }
        return p;
    }
}
