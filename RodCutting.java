import java.util.List;

public class RodCutting {

    //given  a rod of length n you are to cut it into small pieces with its index value representing what we would get at selling at that price
    //This is unbounded knapsack as you can cut from the same piece
    //To cut the value should not be greater than the rod length


    public static int rodcutting(int n , List<Integer> prices){

        //sell from the last index

        return recu(n,prices, prices.size());   //

    }

    public static int recu(int n, List<Integer> prices, int len){

        if(n ==0 || len == 0){
            return 0;
        }

        if(len > n){
            return recu(n,prices,len-1);
        }
        int include= prices.get(len-1) + recu(n - len, prices, len); //price increase, then remove the last element of array
        int exclude = recu(n,prices,len-1);

        return Math.max(include,exclude);
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4);

        System.out.println(rodcutting(4,arr));
    }
}
