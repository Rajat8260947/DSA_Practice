package DSA.Pratice.Pra;

public class SubString {
    public static void main(String[] args) {
        String S1 = "fmmkmkm";
        String S2 = "geeksforgeeks";
        int result = findSubstring(S1, S2);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }

    static  int findSubstring(String s1, String s2){


        int M= s1.length();
        int N= s2.length();

        for (int i = 0; i <= N-M; i++) {
            int j=0;

            for ( j = 0;  j< M;  j++) {

                  if(s2.charAt(i+j) != s1.charAt(j)){
                        break;
                  }

            }

            if(j==M){
                return  i;
            }

        }

        return -1;
    }
}
