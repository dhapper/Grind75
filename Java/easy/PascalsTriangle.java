package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
        public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        rows.add(firstRow);
        if(numRows == 1) { return rows; }

        int row = 2;
        while(row <= numRows){
            List<Integer> lastRow = rows.get(rows.size() - 1);
            List<Integer> nextRow = new ArrayList<>();

            for(int i = 0; i < row; i++){
                if(i == 0 || i == row - 1){
                    nextRow.add(1);
                    continue;
                }
                nextRow.add(lastRow.get(i-1) + lastRow.get(i));
            }

            rows.add(nextRow);
            row++;
        }
        return rows;
    }
}
