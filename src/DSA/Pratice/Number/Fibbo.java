package DSA.Pratice.Number;

public class Fibbo {
    public static void main(String[] args) {
        int term =4;
        int n1 =0,n2=1;
        int nextTerm=0;
        System.out.print(n1 + " " +  n2 + " ");
        for (int i = 2; i <term ; i++) {
            nextTerm = n1+n2;
            n1=n2;
            n2=nextTerm;
            System.out.print(nextTerm + " ");

        }



        System.out.println(n2+ " ");

    }
}
