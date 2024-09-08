package DSA.Pratice.Pra;
//A supermarket maintains a pricing format for all its products. A value N is printed on each product. When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. The task here is to design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed(price).
//
//Example 1:
//
//Input :
//
//5244 -> Value of N
//
//Output :
//160 -> Price
public class MULDIGIT {

    public static void main(String[] args) {
        int n=5244;

        int temp =n;
        int mul =1;

        while (temp!=0){
            int rem = temp%10;
             mul= mul*rem;
             temp=temp/10;
        }

        System.out.println("The Price Of roduct is " + mul);
    }
}
