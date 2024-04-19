package DSA.Stack;

import java.util.Stack;

public class LInkListImplementation {
    public static  class  Node {
         int val ;
         Node next ;

         Node(int val){
             this.val = val;

         }
    }
      public  static  class  LLStack{
           private   Node head = null;
             private int size =0;

             void push (int x){
                  Node temp = new Node(x);
                   temp.next= head;
                    head = temp;
                    size++;

             }
             int pop(){
                 if(head==null){
                     System.out.println("Stack is empty");
                     return -1;
                 }
                 int x = head.val;
                 head= head.next;
                 size--;
                 return x;
             }
             int peek(){
                 if(head==null){
                     System.out.println("Stack is empty");
                     return -1;
                 }
                 return  head.val;
             }
             void displayrec(Node head){
                    if(head==null) return;
                    displayrec(head.next);
                 System.out.print(head.val + " ->");
             }
           void display(){
                 displayrec(head);
               System.out.println();
           }
             void displayRev(){
                 Node temp = head;
                 while (temp!=null){
                     System.out.print(temp.val + "->");
                     temp=temp.next;
                 }
                 System.out.println();
             }
            int size(){
                 return  size;
            }
            boolean isEmpty(){
                 if(size==0){
                     return  true;
                 }
                 return false;
            }

      }

    public static void main(String[] args) {
        LLStack st = new LLStack();
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
