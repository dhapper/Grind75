public class ClimbingStairs{
        public int climbStairs(int n) {

        int combos[] = new int[n + 1];
        combos[1] = 1;
        if(n == 1)
            return combos[n];
        combos[2] = 2;
        if(n == 2)
            return combos[n];

        for(int i = 3; i < combos.length; i ++){
            combos[i] = combos[i - 1] + combos[i - 2];
        }
        
        return combos[n];
    }
}