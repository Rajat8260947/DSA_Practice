package DSA.Pratice.Array;
//
//import java.util.Arrays;
//
//public class Leftroate {
//    public static void main(String[] args) {
//        int n=5;
//
//        int arr[]= {1,2,3,4,5};
//        solve(arr, n);
//    }
//    static  void solve (int[] arr,int n){
//
//        int[] temp = new int[n];
//        for (int i = 1; i <n ; i++) {
//            temp[i-1] = arr[i];
//
//        }
//        temp[n-1] =arr[0];
//
//        System.out.println(Arrays.toString(temp));
//    }
//
//}


import java.util.Scanner;

    class RotateArray {
    public static void main(String[] args) {
       int arr[] = {3,7,8,9,10,11} ;
       int n = arr.length;
       int  k=4;
        k=k%n;
        int sp = 0;
        int ep = arr.length-1;
        reverse(arr,0,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        System.out.println();
        System.out.println("after rotate Element Are ");

        for (int i =0; i<arr.length;i++) {


            System.out.print(arr[i] + " ");
        }

    }
    public static  void reverse(int [] arr,int sp ,int ep){

        while(sp<ep) {
            int temp ;
            temp=arr[sp];
            arr[sp]= arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }


    }



}


