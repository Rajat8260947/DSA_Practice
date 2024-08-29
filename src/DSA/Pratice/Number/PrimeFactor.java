package DSA.Pratice.Number;

public class PrimeFactor {
    public static void main(String[] args) {
        int num =10;
        for (int i = 1; i <= num; i++) {
              if(CheckPrime(i)==true){
//                     int x=num;
                    while(num%i==0){
                        System.out.print(i + " ");
                        num/=i;
                    }
              }
        }


    }
    static  boolean CheckPrime(int num ){
//          boolean flag =true;

          if(num<2){
              return false;
          }

        for (int i = 2; i <num ; i++) {

            if(num %i==0){
                return  false;
            }

        }


         return  true;
    }

}
