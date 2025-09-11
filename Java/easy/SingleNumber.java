public class SingleNumber {
    public int singleNumber(int[] nums) {

        // HashMap<Integer, Boolean> map = new HashMap<>();

        // for(int i = 0; i < nums.length; i++){
        // if(map.containsKey(nums[i])){
        // map.put(nums[i], false);
        // }else{
        // map.put(nums[i], true);
        // }
        // }

        // for(int i = 0; i < nums.length; i++){
        // if(map.get(nums[i]))
        // return nums[i];
        // }

        // return -1;

        // my version doesnt satisfy constant extra space
        // correct answer below using XOR

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
