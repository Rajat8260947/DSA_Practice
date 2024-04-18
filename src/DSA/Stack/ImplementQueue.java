package DSA.Stack;

import java.util.Stack;

public class ImplementQueue {
    public static  class  MyQueue{
        // push efficient code
        Stack <Integer> st1 =  new Stack<>();
        Stack <Integer>  st2 =  new Stack<>();

        public  void add(int x){
            st1.push(x);
        }
        public  int remove(){
            if(st1.size()==0){
                return -1;
            }

                while (st1.size()>1){
                    st2.add(st1.pop());
                }
                int x = st1.pop();
                while (st1.size()>0){
                    st1.add(st2.pop());
                }

                return  x;


        }
        public  int peek(){
            if(st1.size()==0){
                return -1;
            }

                while (st1.size()>1){
                    st2.add(st1.pop());
                }
                int x = st1.peek();
                while (st1.size()>0){
                    st1.add(st2.pop());
                }

                return  x;


        }
    }
    public static void main(String[] args) {

        MyQueue q = new MyQueue();
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(1);

    }
}
