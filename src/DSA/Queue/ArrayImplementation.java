package DSA.Queue;



public class ArrayImplementation {
    public  static  class QueueArray{
        int f =-1;
        int r=-1;
        int [] arr = new int[100];

        public  void add(int val){

            if(r== arr.length-1) {
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                f=r= 0;
                arr[r] = val;
            }
            else {
                arr[r + 1] = val;
                r++;
            }

        }

        public int  remove(){
            if(f==-1){
                System.out.println("Queue is empty");
                return  -1;
            }
            int  x = arr[f];
            f++;

            return  x;
        }
        public  int peek(){
            return  arr[f];
        }

        public     void display(){
            if(f==-1){
                System.out.println("Queue is empty");
                return;
            }
            else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i]);

                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray();
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
