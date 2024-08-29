package DSA.Sorting;

import  java.util.*;

class Bubble{

        public static void main(String[]args){
        int[]arr={4,8,4,3,7};
        sortarray(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        }
        }

      static  void  sortarray(int[]arr){
        for(int i=0;i<arr.length-1;i++){
        for(int j=1;j<arr.length-i;j++){
        if(arr[j]<arr[j-1]){
        int temp = arr[j];
        arr[j]=arr[j-1];
        arr[j-1]= temp;
        }

        }


        }
        }
        }



