package DSA.Recursion;

public class GoldenFibo {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);

    }
    static  int fibo( int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));


    }
}
