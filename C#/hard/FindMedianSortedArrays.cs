public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {

        // NOT O(log (m+n)) HARD
        
        int size = nums1.Length + nums2.Length;
        int[] nums3 = new int[size];
        int p1 = 0, p2 = 0;
        for(int i = 0; i < size; i++){

            if(p2 >= nums2.Length){
                nums3[i] = nums1[p1];
                p1++;
                continue;
            }

            if(p1 >= nums1.Length){
                nums3[i] = nums2[p2];
                p2++;
                continue;
            }

            if(nums1[p1] > nums2[p2]){
                nums3[i] = nums2[p2];
                p2++;
            }else{
                nums3[i] = nums1[p1];
                p1++;
            }
        }

        if(nums3.Length % 2 == 0){
            return (nums3[nums3.Length/2] + nums3[nums3.Length/2 - 1])/2.0; 
        }else{
            return nums3[nums3.Length/2];
        }
    }
}