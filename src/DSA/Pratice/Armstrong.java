package DSA.Pratice;

public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int sum =0;
        double k = String.valueOf(n).length();

        int temp =n;
        while(temp!=0){
             double rem =temp%10;
              sum = sum + (int) Math.pow(rem,k);
              temp = temp/10;
        }
        System.out.println(sum);



    }
}
