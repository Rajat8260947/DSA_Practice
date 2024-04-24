package DSA.Queue;

import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);// alaways add last postion bydefault
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.add(100); // last add
        System.out.println(dq);

        dq.remove(); // first remove
//        dq.removeAll(dq);
        System.out.println(dq);
    }
}
