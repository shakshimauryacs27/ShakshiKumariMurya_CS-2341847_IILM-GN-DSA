import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        int oneNumber= target - nums[i];
        if(numbers.containsKey(oneNumber)){
            return new int[]{i,numbers.get(oneNumber)};
        }
        numbers.put(nums[i], i);
     }
     return new int[]{};

    }
}