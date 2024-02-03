package DSA.Recursion;

public class PrintingNumberReverse {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int num){
        if(num==0){
            return;
        }
//        System.out.print(num+" "); print n->1;
        print(num-1);
        System.out.print(num+" "); // print 1->n;

    }
}
