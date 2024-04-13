package DSA.Queue;

public class ArrayImplemenationInCircularQueue {

    public  static class Circular{
        int size =0;
        int f =-1;
        int r =-1;
        int [] arr = new int[4];
        int n =arr.length;
        public  void add(int x){
            if(size== n){
                System.out.println("Queue is full");

            }
            else if(size==0){
                f=r=0;
                arr[0]=x;

            }

            else if(r<n-1){
                arr[++r]=x;
            }
            else if (r==n-1){
                r=0;
                arr[0] = x;
            }
            size++;
        }
        public  int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return  -1;
            }

             else if(f==n-1){
                int x = arr[f];
                f =0;
                return x;
            }
            int x = arr[f];
            f++;
            size--;
            return x;

        }
        public  void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            if(f<=r){
                for (int i = f; i <=r; i++) {
                    System.out.print(arr[i] + " ");

                }
                System.out.println();
            }

            if(r<f){
                for (int i = f; i <n; i++) {
                    System.out.print(arr[i] + " ");
                }

                for (int i = 0; i <=r ; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Circular  q  = new  Circular();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.add(100);
        q.display();
    }
}
