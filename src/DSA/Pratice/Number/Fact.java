package DSA.Pratice.Number;

public class Fact {
    public static void main(String[] args) {
        int fact =1;
        int num =7;

        if(num ==0){
            fact =1;
        }
//        while(num!=0){
//            fact = fact*num;
//            num--;
//        }
        int i=1;
         while (i<num){
             fact = fact*i;
             i++;
         }
        System.out.println(fact);
    }
}
