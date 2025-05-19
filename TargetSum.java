public class TargetSum {

    //the recursive nature of this problem would be to either add the last in or subtract


    public static int targetSum(int [] nums, int target){

        return recu(nums, nums.length-1, target);   //stating from the last index

    }
    public static int recu(int[] nums, int i, int target){
        int count = 0;
        if(i< 0){
            return target == 0 ? 1 :0;  //base case if target == 0 return 1 else 0 and this 1 is the count
        }
        int includelast = recu( nums, i-1, target - nums[i]);
        int subtractlast = recu(nums, i-1, target + nums[i]);

        return includelast + subtractlast;
    }

    public static void main(String[] args) {
        int [] ar = {1,1,1,1};

        System.out.println(targetSum(ar, 3));
    }
}
