package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class insertAnyIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int idx = 2;
        int x = 7;
        Stack<Integer> rt = new Stack<>();
        System.out.println(st);

        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
