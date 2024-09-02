package DSA.Pratice.Pra;

import java.util.Arrays;

public class MoVeZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0,4,5,0,19,0,5,0};
             int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[count++] = arr[i];

            }
        }

        for (int i =count; i <arr.length ; i++) {

            arr[i]=0;

        }

        System.out.println(Arrays.toString(arr));


    }
}
