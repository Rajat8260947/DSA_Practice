package DSA.Pratice.Number;
class Student {
    private   String  name;
    private   int age;

        String getName (){
        return  name;
    }
           void setName (String name){
        this.name =name;
    }


}
public class PrivateGeter {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rajat");
        System.out.println(s.getName());
    }
}
