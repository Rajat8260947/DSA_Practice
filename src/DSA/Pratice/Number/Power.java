package DSA.Pratice.Number;

//public class Power {
//    public static void main(String[] args) {
////        int num =2;
////        double exp= 2.5;
////        double res = Math.pow(num,exp);
////        System.out.println(res);
//
//        //  while loop
//
//         int num  = 5 ;
//         int  result=  1;
//
//         int exp =3;
//         while (exp!=0)
//         {
//             result = result * num;
//             exp --;
//         }
//        System.out.println(result);
//    }
//}
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void eat(){System.out.println("eating bread...");}
}
class Cat extends Animal{
    void eat(){System.out.println("eating rat...");}
}
class Lion extends Animal{
    void eat(){System.out.println("eating meat...");}
}
class TestPolymorphism3{
    public static void main(String[] args){
        Animal a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
        a=new Lion();
        a.eat();
    }}