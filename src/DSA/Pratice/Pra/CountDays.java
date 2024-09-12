package DSA.Pratice.Pra;

public class CountDays {
    public static void main(String[] args) {
        int n = 29;
        String firstday = "Tuesday";
        occurrenceDays(n, firstday);
    }
    static  void  occurrenceDays(int n ,String  firstday){

        String []  str = { "Monday",
                "Tuesday", "Wednesday",
                "Thursday", "Friday",
                "Saturday", "Sunday" };


        int [] count = new   int [7];

        for (int i = 0; i < 7; i++) {
            count[i] = 4;
        }


        int pos =0;
        for (int i = 0; i < str.length; i++) {

            if(str[i]==firstday){
                pos=i;
            }

        }

        int  extra = n-28;

        for (int i = pos; i <pos+extra ; i++) {

            count[i]= 5;

        }
        for (int i = 0; i < 7; i++)
        {
            System.out.println(str[i] + " " + count[i]);
        }


    }
}
