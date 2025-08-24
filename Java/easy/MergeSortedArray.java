package easy;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0)
            return;

        int[] sorted = new int[m + n];
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < sorted.length; i++) {

            if (p1 >= m) {
                sorted[i] = nums2[p2];
                p2++;
                continue;
            }

            if (p2 >= n) {
                sorted[i] = nums1[p1];
                p1++;
                continue;
            }

            if (nums1[p1] < nums2[p2]) {
                sorted[i] = nums1[p1];
                p1++;
            } else {
                sorted[i] = nums2[p2];
                p2++;
            }
        }

        // System.out.println(Arrays.toString(sorted));

        for (int i = 0; i < sorted.length; i++) {
            nums1[i] = sorted[i];
        }
        return;
    }
}
