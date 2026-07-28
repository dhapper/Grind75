public class Solution {
    public IList<IList<int>> ThreeSum(int[] nums) {

        // brute force aka the wrong logic

        IList<IList<int>> triplets = new List<IList<int>>();
        HashSet<string> usedTriplets = new HashSet<string>();

        for(int i = 0; i < nums.Length; i++){
            for(int j = 0; j < nums.Length; j++){
                if(j == i) continue;
                
                int complement = - nums[i] - nums[j];

                for(int k = 0; k < nums.Length; k++){
                    if(k == i || k == j) continue;

                    if(nums[i] + nums[j] + nums[k] == 0){
                        // using sorted string to check for dupes
                        List<int> triplet = new List<int> { nums[i], nums[j], nums[k] };
                        triplet.Sort();
                        string key = string.Join(",", triplet);
                        if(usedTriplets.Contains(key)) continue;

                        usedTriplets.Add(key);
                        triplets.Add(new List<int> {nums[i], nums[j], nums[k]});
                        Console.WriteLine($"{nums[i]}, {nums[j]}, {nums[k]}");
                    }
                }
            }
        }

        return triplets;
    }
}