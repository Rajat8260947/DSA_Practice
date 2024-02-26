package DSA.Linklist;

public class DLL {

    private Node head;

    public  void insertFirst(int val){
        Node node = new Node(val);
        node.next = head ;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        Node last = head;
        if(head == null){
            node.prev = null;
            head= node;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev= last;

    }
    public  Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.val==val){
                return  node;
            }
            node = node.next;
        }
        return  null;
    }
    public void insertAfter (int after , int val){
        Node prev = find(after);
        if(prev== null){
            System.out.println("does not exist ");
            return;
        }
        Node node = new Node (val);
        node.next = prev.next;
        prev.next=node;
        node.prev=prev;
        if(node.next!= null){ // for last node checking
             node.next.prev=node;
        }
    }

    public  void display () {
         Node node = head;
         Node last = null;
         while (node!=null){
             System.out.print(node.val + "->");
             last = node;
             node = node.next;



         }
        System.out.println("END");
        System.out.println("Print in reverse");
        while (last!=null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
    private class  Node{
         int val;
         Node next;
         Node prev;

        public Node(int val) {
            this.val = val;
        } public Node(int val,Node next ,Node prev) {
            this.val = val;
            this.next = next;
            this.prev=prev;
        }
    }

}
