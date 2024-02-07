package DSA.Recursion.Subset;

public class Stream {
    public static void main(String[] args) {
        skip(" " , "baccdah");
        System.out.println(skipup("baccdah"));
        System.out.println(skippapple("bappleccdah"));

    }

    static  void skip(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
        // OR
    }
        static   String skipup(String up) {

            if (up.isEmpty()) {

                return "";
            }
            char ch = up.charAt(0);

            if (ch == 'a') {
                return skipup(up.substring(1));
            } else {
                return ch + skipup(up.substring(1));
            }
        }



        // Skip  a string;

        static String  skippapple(String up) {

            if (up.isEmpty()) {
                return "";
            }
                if (up.startsWith("apple")) {
                    return skippapple(up.substring(5));
                } else {
                    return up.charAt(0) + skippapple(up.substring(1));
                }

            }
        }




