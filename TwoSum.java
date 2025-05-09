import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        //try and brute force it
        // time complexity of n*n

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j <nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int i = 6;
        int []arr= {3,3};
        System.out.println(Arrays.toString(twoSum(arr, i)));
    }
}


