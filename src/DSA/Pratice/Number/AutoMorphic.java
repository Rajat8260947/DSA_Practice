package DSA.Pratice.Number;

public class AutoMorphic {
    public static void main(String[] args) {
        int num =  25;
          int res = (int) Math.pow(num,2);
              while (num !=0) {


                  if (num % 10 != res % 10) {
                      System.out.println("The Number is not automorphic");
                  }

                  num =num/10;
                  res =res/10;
              }




               System.out.println("The Number is automorphic");


    }
}
