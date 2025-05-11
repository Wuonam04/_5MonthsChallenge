public class PalindromeNumber {
    public static String isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z]", "").toLowerCase(); //removing all unwanted cases and changing everything to lower case

        int i = 0;
        int j = clean.length()-1;  //last index
        System.out.println(clean);   //debuggingMode

        while(i<j){
            if(clean.charAt(i) != clean.charAt(j)){   //if the index from start not equal to index at the end
                return "false";
            }
            i++;
            j--;
        }
        return "true";

    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("ttty"));
    }
}
