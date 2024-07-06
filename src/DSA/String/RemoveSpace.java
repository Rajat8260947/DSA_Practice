package DSA.String;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Prep    In sta";
        char [] ch = str.toCharArray();
        String temp = "";
        for (int i = 0; i < ch.length; i++) {
             if( (ch[i]!= ' ')&& (ch[i] != '\t')){
                 temp = temp+ch[i];
             }
        }
        System.out.println("String after removing spaces  : " + temp);

    }
}
