public class CoinChange {

   /* Given an amount and the denominations of coins available, determine how many ways change can be made for amount. There is a limitless supply of each coin type.*/
//The idea here is to pick the last coin or not
    //It has t be smaller or equal to the coin

    public static long getWays(int n, int [] arr){
        return recu(n, arr, arr.length-1);
    }

    private static long recu( int n, int [] arr, int len){
        /*if(arr.length == 0){
            return 0;
        }*/
        if( n == 0){
            return 1;
        }
        if(len < 0 || n < 0){
            return 0;
        }


        long include = recu(n - arr[len], arr, len);
        long exclude = recu(n , arr, len-1);

        return include + exclude;

    }

    public static void main(String[] args) {
        int [] arr = {8,3,1,2};

        System.out.println(getWays( 3, arr));
    }

}
