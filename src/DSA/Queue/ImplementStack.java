package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStack {
    public static class Mystack {
        Queue<Integer> q = new LinkedList<>();


        public void push(int x) {
            q.add(x);
        }

        public int peek() {
            for (int i = 1; i <= q.size() - 1; i++) {
                q.add(q.remove());

            }
            int x = q.peek();
            q.add((q.remove()));

            return x;
        }

        public int pop() {
            if (q.size() == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            for (int i = 1; i <= q.size() - 1; i++) {
                q.add(q.remove());

            }
            int x = q.peek();
            q.remove();

            return x;
        }

        public boolean empty() {
            if (q.size() == 0) {

                return true;
            }

             return  false;
        }
    }
    public static void main(String[] args) {

        Mystack st = new Mystack();

        st.push(1);
        st.push(3);
        st.push(2);
        st.push(4);
        st.pop();
        st.peek();
    }
}
