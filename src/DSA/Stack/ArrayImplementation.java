package DSA.Stack;

import java.util.Stack;

public class ArrayImplementation {
    public  static  class  Stack{
        private int [] arr = new int [5];
        private  int idx = 0; // similar to size
        void push(int x){
         if(isFull()){
             System.out.println("Stack is full ");
             return;
         }
            arr[idx] =x;
            idx++;
        }
        int peek() {
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return  arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            idx--;
            return  top;
        }
        void  display(){
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");

            }
            System.out.println();
        }

        int size(){
            return  idx;
        }
        boolean isEmpty() {
            if (idx == 0){
                return true;

            }
            else  return false;
        }
        boolean isFull(){
            if(idx==arr.length){
                return  true;
            }
            else  return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.pop();
        st.display();
        System.out.println( st.size());
        System.out.println(st.peek());
    }
}
