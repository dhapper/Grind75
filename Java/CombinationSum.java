import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> answers = new ArrayList<>();
        findCombinations(nums, target, new ArrayList<>(), answers, 0);
        return answers;
    }

    private void findCombinations(int[] nums, int target, List<Integer> path, List<List<Integer>> answers, int index) {
        if (target == 0) {
            answers.add(new ArrayList<>(path)); // found valid combination
            return; // return call only goes back one step (ie can go back to for loop below)
        }

        if (target < 0) return; // overshot the target, stop

        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]); // pick number
            findCombinations(nums, target - nums[i], path, answers, i); // stay on same i (recursion)
            path.remove(path.size() - 1); // undo the pick (backtracking)
        }
    }

    // recrusive solution is required
    // uses backtracking to undo choices when overshot
}
