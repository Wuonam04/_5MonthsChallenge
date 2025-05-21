import java.util.List;

public class RodCutting {

    //given  a rod of length n you are to cut it into small pieces with its index value representing what we would get at selling at that price
    //This is unbounded knapsack as you can cut from the same piece
    //To cut the value should not be greater than the rod length


    public static int rodcutting(int n , List<Integer> prices){

        //sell from the last index

        return recu(n,prices, prices.size());   //but consider from 1

    }

    public static int recu(int n, List<Integer> prices, int len){

        if(n ==0 || len == 0){   //Base cases no more to cut or when already finisehed
            return 0;
        }

        if(len > n){
            return recu(n,prices,len-1);   //when last element is greater than what we need to cut do not consider it.
        }
        int include= prices.get(len-1) + recu(n - len, prices, len); //price increase, then remove the last element of array, we cut then len from rod so we reduce it
        int exclude = recu(n,prices,len-1);

        return Math.max(include,exclude);
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(10,1,5,8);

        System.out.println(rodcutting(7,arr));
    }
}
