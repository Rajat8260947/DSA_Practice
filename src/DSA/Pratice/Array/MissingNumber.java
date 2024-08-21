package DSA.Pratice.Array;

public class MissingNumber {
    public static void main(String[] args) {


        int N = 7;
        int arr[] = {1, 2,3 ,4, 5,7};

        int ans = missingNumber(arr, N);
        System.out.println("The missing number is: " + ans);
    }
    static  int missingNumber(int []arr ,int n){
        int sum1=0;
        int sum2 = (n*(n+1))/2;

        for (int i=0;i< arr.length;i++){
            sum1+=arr[i];
        }
        int result = sum2-sum1;

        return  result;
    }
}