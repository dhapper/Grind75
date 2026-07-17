public class Solution {
    public int MaxArea(int[] height) {

        int left = 0, right = height.Length - 1;
        int maxVol = GetVolume(height[left], height[right], right - left);

        while(left < right){

            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            maxVol = Math.Max(maxVol, GetVolume(height[left], height[right], right-left));
            
        }

        return maxVol;
        
    }

    public int GetVolume(int height1, int height2, int width){
        return (int) Math.Min(height1, height2) * width;
    }
    
}