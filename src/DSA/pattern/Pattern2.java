package DSA.pattern;
//          ****
//         *    *
//         *    *
//          ****
public class Pattern2 {
    public static void main(String[] args) {

//        pattern1(5);
        pattern2(5);

    }
    static void pattern1(int n) {


        for (int row = 1; row <= n; row++) {

              if(row==1||row==n){
                for (int col = 1; col <=n; col++) {
                    System.out.print("* ");

                }


            }
              else{
                  System.out.print("* ");
                  for (int space = 1; space <=n-2; space++) {
                      System.out.print("  ");
                  }
                  System.out.print("* ");
              }


            System.out.println();

        }
    }
       // Rhombous
       static void pattern2(int n) {
           for (int row = 1; row <=n ; row++) {
               int space = row-1;
               for (int i =0; i <space ; i++) {
                   System.out.print(" ");

               }
               for (int col = 1; col <=n ; col++) {
                   System.out.print("*");

               }
               System.out.println();

           }

       }
}
