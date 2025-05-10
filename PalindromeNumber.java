public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);  //i want to access each element individually

        int i = 0;   //start from the first index
        int j = str.length()-1;   ///starts from the last index

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {   //each character should be the same
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1215));
    }
}
