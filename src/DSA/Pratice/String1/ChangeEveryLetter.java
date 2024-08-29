package DSA.Pratice.String1;

public class ChangeEveryLetter {
    public static void main(String[] args) {
        String str = "abcdxyz";
        int n = str.length();
         String temp="";

        for (int i = 0; i <n ; i++) {

            int ascii = str.charAt(i);

            if(ascii==90){
                 temp = temp + (char)(65);

            }
             else if(ascii==122){
                 temp = temp + (char)(97);
            }
             else if(ascii>=65 && ascii<90 || ascii>=97 && ascii<122){
                 temp = temp +(char)(ascii+1);
            }
//            System.out.println(temp);


        }
        System.out.println(str);
        System.out.println(temp);

    }
}
