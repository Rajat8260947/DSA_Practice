package DSA.Array;

public class CountZero {
    public static void main(String[] args) {
        int n = 1200045;
        int count =0;
        while(n!=0){
            int rem = n%10;
            if(rem==0){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}
