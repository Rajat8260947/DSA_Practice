package DSA.Pratice;

public class Divisor {
    public static void main(String[] args) {
        int num =12;
        int[] size = new int[1];
        int [] result = printdivisor(num,size);
        System.out.print("Divisors of " + num + " are: ");
        for (int i = 0; i < size[0]; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    static  int [] printdivisor(int num ,int[]size){

         int [] divisor = new int [num];

         int count =0;

        for (int i = 1; i <=num ; i++) {

            if(num%i ==0){
                divisor[count++] =i;
            }

        }

        size [0] = count;

        return  divisor ;


    }
}
