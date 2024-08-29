package DSA.Pratice.MultiThreading;
  class  UserThread  extends  Thread{
      @Override
      public void run() {
          System.out.println("This is user defined Thread ");
      }
  }
public class ThreadOp {
    public static void main(String[] args)  throws  Exception{

        int x = 56+34;
        System.out.println("sum is "+x);
         Thread t = Thread.currentThread();
         String tName = t.getName();

        System.out.println("Current running Thread is " + tName);
          t.setName("MyMain");

          Thread.sleep(4000);
        System.out.println(t.getId());


        System.out.println("program is ended");
        UserThread thread = new UserThread();

        thread.start();





    }
}
