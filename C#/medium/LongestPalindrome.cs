public class Solution {
    public string LongestPalindrome(string s) {

        string longest = "";

        for(int i = 0; i < s.Length; i++){

            // check all single letter centers
            string currentString = expand(s, i);
            if(longest.Length < currentString.Length){
                longest = currentString;
            }
            z
            // check all double letter centers
            currentString = expand(s, i, false);
            if(longest.Length < currentString.Length){
                longest = currentString;
            }
        }
        
        return longest;
    }

    public string expand(string s, int index, bool single = true){
        int left = index, right = single ? index : index + 1;
        while(left >= 0 && right < s.Length){
            if(s[left] != s[right]){
                break;
            }
            left--;
            right++;
        }
        left++;
        right--;
        return s.Substring(left, right-left + 1);
    }
}