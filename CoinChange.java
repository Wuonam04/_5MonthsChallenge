import java.util.Arrays;

public class CoinChange {

   /* Given an amount and the denominations of coins available, determine how many ways change can be made for amount. There is a limitless supply of each coin type.*/
//The idea here is to pick the last coin or not
    //It has t be smaller or equal to the coin

    public static long getWays(int n, int [] arr){
        return recu2(n, arr, arr.length-1);
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
    private static long recu2( int n, int [] arr, int len){

        if(len < 0 || n < 0){
            return 0;
        }

        int [] prev = new int[n+1];     //TODO check whether the first value not being 0 will affect the array. Ideally it should
        Arrays.fill(prev, Integer.MAX_VALUE);   // previous array of size n with all values being big
        prev[0] = 0;

        int [] curr = new int[n+1];
        Arrays.fill(curr,Integer.MAX_VALUE);
        curr[0] = 0;

        for(int coin = 0; coin < len; coin++ ){
            for(int  j = arr[coin]; j<= n; j++){
                if(arr[coin] > n){
                    curr[j] = prev[j];
                }
                else{
                    int a = prev[j];
                    int b = 1 + curr[j- arr[coin]];
                    /*System.out.println(a);
                    System.out.println(b);*/
                    curr[j] = Math.min(a,b);
                }

            }
            prev = curr;
        }
        return curr[len];
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3};

        System.out.println(getWays( 4, arr));
    }

}
