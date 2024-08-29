package DSA.Pratice.Number;

public class ArmstrongIntheRange {
    public static void main(String[] args) {
        int low =0,high=1000;
        System.out.println("Armstrong number are");
        for (int i = low; i <=high; i++) {
            boolean result = armstrong(i);
            if(result==true) {
                System.out.print( i + " ");
            }

        }



    }
      static  boolean armstrong(int num){

        int sum = 0;
          int count =0;
          int temp =  num;
        while(temp!=0){
            count++;
            temp=temp/10;
        }

        temp =num;
        while(temp!=0){
            int rem = temp%10;
            sum = sum+(int)Math.pow(rem,count);
            temp = temp/10;

        }

        if(num ==sum){
            return true;

        }

        return  false;




      }
}
