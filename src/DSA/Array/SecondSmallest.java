package DSA.Array;


import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the number");
        for (int i =0; i<arr.length;i++){

            arr[i] = sc.nextInt();
        }
        int  Ssmallest= secondSmallest(arr,n);
        System.out.println("The Second Smallest Element is " +Ssmallest);
    }
    public  static int secondSmallest(int[] arr, int n){
        int smallest = arr[0];
        int Ssmallest = Integer.MAX_VALUE;
        for (int i =1; i<n;i++){
            if(arr[i]<smallest){
                Ssmallest = smallest;
                smallest=arr[i];
            }
            else if (arr[i]>smallest && arr[i]<Ssmallest){
                Ssmallest=arr[i];
            }
        }


        return Ssmallest;
    }

}