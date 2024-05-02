package DSA.Queue;

public class LinkListImplementation {

    public  static   class  Node{
        int val ;
        Node next;

        Node(int val){
            this.val = val;

        }

    }
   static class QueueLL {
        Node head = null;
        Node  tail = null;
        int size =0;
        public  void  add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public  int peek(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            return  head.val;
        }
        public  int remove(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            int x= head.val;
            head = head.next;
            size--;
            return x;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
             Node temp = head;
             while (temp!=null){
                 System.out.print(temp.val + "->");
                 temp= temp.next;
             }
            System.out.println();
        }





    }
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
    }
}
