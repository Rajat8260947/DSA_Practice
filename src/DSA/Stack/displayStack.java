package DSA.Stack;

import java.util.Stack;

public class displayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayRecREV(st);
        System.out.println(st);
//        Stack<Integer> rt = new Stack<>();
//        System.out.println(st);
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        while (rt.size()>0){
//            System.out.print(rt.peek()+ " ");
//            st.push(rt.pop());
//        }

        // IN array
        int n = st.size();
        int[] arr = new int[n];

        for (int i = n-1; i >=0; i--) {
            arr[i] = st.pop();

        }
          for (int i = 0; i <n; i++) {
//              System.out.print(arr[i] + " ");
              st.push(arr[i]);

        }



    }
    public  static  void displayRecREV(Stack<Integer>st){
        if(st.size()==0){
//            st.push(10); push at buttom
            return;
        }
        int top = st.pop();
//        System.out.print(top+" "); // display rev
        displayRecREV(st);
        System.out.print(top+" "); // display normal
        st.push(top);
    }

}
