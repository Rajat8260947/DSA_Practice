package DSA.Stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

        // Iterative method for reverse stack
//        Stack<Integer> rt = new Stack<>();
//        System.out.println(st);
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        Stack<Integer> gt = new Stack<>();
//        while (rt.size()>0){
//            gt.push(rt.pop());
//        }
//        while (gt.size()>0){
//            st.push(gt.pop());
//        }
//        System.out.println(st);
    }
    public  static  void pushAtBottom( int x ,Stack<Integer>st){
              if(st.size()==0){
                  st.push(x);
                  return;
              }
              int top =st.pop();
              pushAtBottom(x,st);
              st.push(top);

    }
    public  static  void reverse(Stack<Integer>st){
        if(st.size()==1){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(top, st);
    }
}
