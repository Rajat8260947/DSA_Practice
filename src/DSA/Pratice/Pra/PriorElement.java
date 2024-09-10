package DSA.Pratice.Pra;
import java.util.*;
//Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
class Main
{
    public static void main(String[] args)
    {

        int arr[]= {7,4,8,2,9};

        int max=Integer.MIN_VALUE;

        int count=0;
        for(int i=0;i< arr.length;i++) { if(arr[i]>max)

        {
            max=arr[i];
            count++;
        }
        }
        System.out.println(count);
    }
}
