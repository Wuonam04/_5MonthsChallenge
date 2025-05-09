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



        HashMap<Integer, Integer> checker = new HashMap<>(); //key value pair of Integer

        for(int i = 0; i < nums.length; i++){
            if(checker.containsKey(nums[i])){
                return new int[]{ checker.get(nums[i]),i};  //getting the  value of hashmap where the parent of the compliment is found index of the compliment where we are at
            }
            checker.put(target- nums[i], i); //putting the compliment as key and index where to find me as value
        }
        return null;

        //may also be done using list<integer>
        //list.get(i)
        //list.size()
        //return Array.asList(checker.get(nums[i]),)
        //

    }


    public static void main(String[] args) {
        int i = 9;
        int []arr= {3,3,8,5,9,4};
        System.out.println(Arrays.toString(twoSum(arr, i)));
        System.out.println(Arrays.toString(twoSum2(arr, i)));
    }
}


