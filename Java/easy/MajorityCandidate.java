package easy;

public class MajorityCandidate {
    public int majorityElement(int[] nums) {

        // boyer moore alg

        // [2, 2, 3, 4]

        int count = 0;
        int candidate = 0;
                                        // iterations   
        for (int num : nums) {          // 1st          2nd         3rd         4th
            if (count == 0)                         
                candidate = num;        // cand = 2;    >>          -           -

            if (num == candidate)       
                count++;                // count = 1    count = 2       
            else
                count--;                //                          count = 1   count = 1       END: candidate still = 2;
        }       

        return candidate;
    }
}
