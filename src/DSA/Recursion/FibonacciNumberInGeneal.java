package DSA.Recursion;

import java.util.Scanner;

public class FibonacciNumberInGeneal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term ");
        int n = sc.nextInt();
        int n1=0;
        int n2=1;

        for (int i = 0; i <= n; i++) {
            System.out.print(n1 + " ");
            int n3= n1+n2;
            n1=n2;
            n2=n3;

        }

//        System.out.println(n1);
    }
}
