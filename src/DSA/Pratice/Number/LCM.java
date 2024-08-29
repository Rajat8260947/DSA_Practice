package DSA.Pratice.Number;

public class LCM {
    public static void main(String[] args) {
        int num1=12,num2=13;
         int gcd=1;
        for (int i = 1; i <=Math.min(num1,num2) ; i++) {
              if(num1%i==0 &&num2%i==0){
                  gcd =i;
              }
        }

        int lcm = (num1*num2)/gcd;
        System.out.println(lcm);
    }
}
