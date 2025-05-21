public class LongestSub {
    
        public static int longest(String t1, String t2) {
            if (t1.isEmpty() || t2.isEmpty()) {
                return 0;
            }

            if (t1.charAt(0) == t2.charAt(0)) {
                return 1 + longest(t1.substring(1), t2.substring(1));

            } else {

                return Math.max(longest(t1.substring(1), t2), longest(t1, t2.substring(1)));
            }
        }

        public static void main(String[] args) {

            String t1 = "abcdefghi";
            String t2 = "ecdgi";


            System.out.println(longest(t1,t2));
        }
    }

