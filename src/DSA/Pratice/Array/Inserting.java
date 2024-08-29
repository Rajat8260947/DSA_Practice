package DSA.Pratice.Array;

import java.util.Arrays;

public class Inserting {
    public static void main(String[] args) {
        int [] arr = {1,2,0,4,5,0};
        int pos = 3;
        int element =8;

        int [] newa= new int [arr.length+1];

        for (int i = 0; i <pos ; i++) {
            newa[i] = arr[i];

        }
          newa[pos] =element;
        for (int i = pos; i <arr.length ; i++) {

            newa[i+1] = arr[i];

        }



        System.out.println(Arrays.toString(newa));
    }
}
