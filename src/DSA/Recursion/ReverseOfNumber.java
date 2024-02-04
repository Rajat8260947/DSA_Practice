package DSA.Recursion;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        rev1(num);
        System.out.println(sum);
        int sum = rev2(num);
        System.out.println(sum);

    }

    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;

        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);

    }


    static int  rev2(int n) {
        // sometimes you might need some additional  variables int the argument
        // in that case ,make another function
       int digits = (int)(Math.log10(n))+1;
       return helper(n,digits);


    }
      static  int helper(int n ,int digits){

        if(n==0){
            return 0;
        }
        int rem = n%10;
        return  rem* (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);

      }
}