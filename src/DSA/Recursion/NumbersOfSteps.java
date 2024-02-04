package DSA.Recursion;

public class NumbersOfSteps {
    public static void main(String[] args) {
        System.out.println(steps(2)
        );

    }

    public static int steps(int num) {
        return helpers(num, 0);
    }

    static int helpers(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if(num%2==0){
            return helpers(num/2,steps+1);
        }
        else {
            return helpers(num-1,steps+1);

        }

    }
}
