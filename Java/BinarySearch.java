public class BinarySearch {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoid overflow
            if (nums[mid] == target) {
                return mid; // found target
            } else if (nums[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }
        return -1; // target not found
    }
}
