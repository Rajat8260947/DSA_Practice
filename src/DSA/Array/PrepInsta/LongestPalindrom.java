package DSA.Array.PrepInsta;

public class LongestPalindrom {
    public static void main(String[] args) {
        int []arr= { 121, 2322, 54545, 999990 };
        int n = arr.length;
        System.out.println( "The longest Palindrom number is " +longestPali(arr));
    }

    static  boolean Ispalindrom(int num){
        int temp= num;
        int rev =0;
        while(num!=0){
            int rem =num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        if(temp!=rev){
            return  false;
        }
//        System.out.println(rev);
        return  true;
    }

    static  int longestPali(int[]arr){
        int res =-1;
        for (int i = 0; i < arr.length; i++) {

                if(arr[i]>res && Ispalindrom(arr[i])){
                    res= arr[i];
                }


        }

        return  res;
    }
}
