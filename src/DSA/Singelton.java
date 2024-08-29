package DSA;

//   It can create only  object
public class Singelton {

        private Singelton(){

    }

     private  static Singelton instance ;

        public  static Singelton getInsatnce(){
           if(instance ==null){
               instance = new Singelton();
           }

           return instance;
        }


    public static void main(String[] args) {

            Singelton s1 = Singelton.getInsatnce();
//            Singelton s2=  new Singelton();

    }
}
