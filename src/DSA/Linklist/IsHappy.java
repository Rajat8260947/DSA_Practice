package DSA.Linklist;

import java.util.Scanner;

public class IsHappy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        Boolean ans = IshappyNumber(num);
        System.out.println("Is the number happyNumber  " + ans);
    }
    public  static  Boolean IshappyNumber(int num){
        int slow = num;
        int fast = num;
     do {
       slow = findSquare(slow);
         fast = findSquare(findSquare(fast));
     } while (slow!=fast);
        if(slow==1){
            return  true;
        }

        return  false;
    }
    static  int findSquare(int num){
        int ans =0;
        while(num>0){
            int rem = num%10;
            ans  +=rem*rem;
            num = num/10;
        }
        return  ans;
    }
}
