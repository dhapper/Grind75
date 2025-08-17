package easy;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (true) {
            int mid = low + (high - low) / 2;
            System.out.println(mid);
            if (isBadVersion(mid)) {
                if (!isBadVersion(mid - 1))
                    return mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }

    // dummy method to remove errors
    public boolean isBadVersion(int n) {
        return true;
    }

}