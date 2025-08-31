import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII{
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> master = new ArrayList<>();

        master.add(Arrays.asList(1));
        if(rowIndex == 0)
            return master.get(master.size()-1);
        master.add(Arrays.asList(1, 1));
        if(rowIndex == 1)
            return master.get(master.size()-1);

        for(int i = 2; i <= rowIndex; i++){
            List<Integer> last = master.get(i-1);
            List<Integer> next = new ArrayList<>();
            next.add(1);
            for(int j = 1; j < i; j++){
                int x = last.get(j-1);
                int y = last.get(j);
                int z = x+y;
                next.add(z);
            }
            next.add(1);
            master.add(next);
            System.out.println(next);
        }
        
        return master.get(master.size()-1);
    }
}