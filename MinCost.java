public class MinCost {

    /*You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

    You can either start from the step with index 0, or the step with index 1.

    Return the minimum cost to reach the top of the floor.*/


    //option will be to either take the last staircase or the second last

    //f(n) = min(array[-2] + f(n-1) , array[-1] + f(n-1))


    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        for(int i = 2; i<n; i++){
            cost[i] += Math.min(cost[i-1], cost[i-2]);   //cost should increase if i either take the last or second lasr


        }

        return Math.min(cost[n-1], cost[n-2]);
    }

    public static void main(String[] args) {

        int [] a = {1,100,1,1,1,100,1,1,100,1};
        int [] b = {4,10,23};
        System.out.println(minCostClimbingStairs(a));
        System.out.println(minCostClimbingStairs(b));
    }
}
