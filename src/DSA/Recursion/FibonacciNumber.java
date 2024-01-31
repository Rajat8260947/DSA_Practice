package DSA.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);

    }
    static  int fibo( int n){
        if(n<2){
            return  n;
        }
        return  fibo(n-1) + fibo(n-2);
    }
}

// or
//class GFG {
//
//    // Function to print the fibonacci series
//    static int fib(int n)
//    {
//        // Base Case
//        if (n <= 1)
//            return n;
//
//        // Recursive call
//        return fib(n - 1) + fib(n - 2);
//    }
//
//    // Driver Code
//    public static void main(String args[])
//    {
//        // Given Number N
//        int N = 10;
//
//        // Print the first N numbers
//        for (int i = 0; i < N; i++) {
//
//            System.out.print(fib(i) + " ");
//        }
//    }
//}
