// https://www.interviewbit.com/problems/pascal-triangle/
// First & Last values are 1; other values are prevLine[currId-1] + prevLine[currId]
import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> returnList= new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> line;
        ArrayList<Integer> prevLine;
        int i, j;

        for (i = 0; i < A; i++)
        {
            line = new ArrayList<Integer>();
            for(j = 0; j <= i; j++)
            {
                // first & last values are always 1
                if(j == 0 || j == i)
                {
                    line.add(1);
                }
                else if (i > 0)
                {
                    prevLine = returnList.get(i-1);
                    line.add(prevLine.get(j-1) + prevLine.get(j));
                }

            }
            returnList.add(line);
        }

        return returnList;
    }
}