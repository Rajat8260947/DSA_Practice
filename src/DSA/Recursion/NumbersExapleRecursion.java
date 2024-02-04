package DSA.Recursion;

public class NumbersExapleRecursion {
    public static void main(String[] args) {
//        print(1);
          concept(5);

    }
    static  void print( int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
        System.out.println("THis is recursion");
    }
static  void concept( int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
//        concept(n--);-> infinite loop because it always passing 5
           concept(--n);//-> fist subtract then pass   the value

    }

}
