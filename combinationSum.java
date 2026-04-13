class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, int target, List<Integer> curr, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0 || index == nums.length) return;

        // pick (stay on same index)
        curr.add(nums[index]);
        backtrack(index, nums, target - nums[index], curr, result);
        curr.remove(curr.size() - 1);

        // skip (move to next index)
        backtrack(index + 1, nums, target, curr, result);
    }
}