package DSA.BitManipulation;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int [][] arr= {{1,0,1},{1,1,0},{0,0,0}};
        int [][] ans  = Flip(arr);
        for (int i = 0; i < ans.length ;i++) {
            for (int j = 0; j <ans[i].length ; j++) {
                System.out.print(ans[i][j]);

            }

            System.out.println();

        }
    }
    static  int [][]  Flip(int [][] arr) {
        for (int[] row : arr) {
            for (int i = 0; i < (arr[0].length+1)/2; i++) {
                int temp = row[i]^1;
                row[i] = row[arr[i].length-i-1] ^1;
                row[arr[i].length-i-1] =temp;

            }


        }
        return  arr;
    }
}
