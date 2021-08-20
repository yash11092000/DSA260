package DSA460;

import java.util.Arrays;

public class Negative_integer_to_one_side {
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int i=0,j= arr.length-1;
        while (i<=j){
            if(arr[i]>0 && arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i]>0 && arr[j]>0){
                j--;
            }
            else if(arr[i]<0 && arr[j]<0){
                i++;
            }
            else{
                i++;
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
