package DSA.Recursion;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int sumOfdigit = sum(num);
        System.out.println(sumOfdigit);

    }
    static  int sum (int num){
        if(num==0){
            return  0;
        }

        return  num%10+sum(num/10);

    }
}
