package DSA.Recursion;

import java.util.Scanner;

public class ProductaOfdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int productofdigit = product(num);
        System.out.println(productofdigit);

    }
    static  int product(int num){
        if(num==0){
            return  1;
        }

        return  num%10 * product(num/10);


    }
}
