package easy;

public class SqrtX {
    public int mySqrt(int x) {

        if(x == 0) return 0;
        if(x == 1) return 1;

        long low = 1;
        long high = x/2;

        while(low <= high){
            long mid = low + (high - low)/2;
            if(mid*mid > x){
                long check = mid-1;
                if(check*check <= x)
                    return (int) check;
                high = mid-1;
            }else if(mid*mid == x){
                return (int) mid;
            }else{
                low = mid+1;
            }

        }

        return (int) high;
        
    }
}
