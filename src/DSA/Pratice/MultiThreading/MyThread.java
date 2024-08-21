package DSA.Pratice.MultiThreading;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println( " Value of i is " +i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }

        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread th=new Thread(t1);

//         Object of another Thread

         AnotherThread t2 = new AnotherThread();
        th.start();
         t2.start();


    }
}
