package DSA.Stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int [] price ={100,80,60,70,60,75,85};
        int [] arr = new int [price.length];

        Stack<Integer> st= new Stack<>();

        st.push(0);
        arr[0] =1;
        for (int i =1 ; i < arr.length; i++) {
            while(st.size()!=0 && price[st.peek()]<price[i]){
                st.pop();
            }
            if(st.size()==0) arr[i] =i+1;
            else  arr[i]=i-st.peek();
            st.push(i);
        }

       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
