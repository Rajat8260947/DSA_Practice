package DSA.String;

public class CountWord {
    public static void main(String[] args) {
        String str = "HI AMY AND JAY";
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
              if (str.charAt(i)==' '){
                  count++;
              }

        }
        count = count+1;
        System.out.print("The Number Of Words is " +count);


    }
}
