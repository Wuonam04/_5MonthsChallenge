import java.util.Arrays;
import java.util.HashMap;

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


    public static int[] twoSum2(int[] nums, int target){

        //I want to improve performance by introducing memoisation

        //Hashmap wither Integer for both key and value
        //I will store the compliment otf the number I am at and  it's actual index
        //[2,3,5]  target 5
        //will store 3 and 0 incase of two and iterate to find 3



        HashMap<Integer, Integer> checker = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(checker.containsKey(nums[i])){
                return new int[]{ checker.get(nums[i]),i};
            }
            checker.put(target- nums[i], i);
        }
        return null;

    }


    public static void main(String[] args) {
        int i = 6;
        int []arr= {3,3};
        System.out.println(Arrays.toString(twoSum(arr, i)));
        System.out.println(Arrays.toString(twoSum2(arr, i)));
    }
}


