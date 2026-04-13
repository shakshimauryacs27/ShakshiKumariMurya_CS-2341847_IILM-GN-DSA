public class permutation {
    
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, 0, result);
        return result;
    }

    private void solve(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) list.add(num);
            result.add(list);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);

            solve(nums, index + 1, result);

            swap(nums, i, index); // backtrack
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}