// https://www.interviewbit.com/problems/sort-array-with-squares/
// Had to look at solution approach, try to solve again
import java.util.ArrayList;

public class SortArrayWithSquares {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> negativeList = new ArrayList<Integer>();
        ArrayList<Integer> positiveList = new ArrayList<Integer>();
        ArrayList<Integer> outputList = new ArrayList<Integer>();
        int i, temp, j;

        for (i = 0; i < A.size(); i++)
        {
            temp = A.get(i);
            if(temp >= 0)
            {
                positiveList.add(A.get(i) * A.get(i));
            }
            else
            {
                negativeList.add(A.get(i) * A.get(i));
            }

        }

        i = negativeList.size() - 1;
        j = 0;
        while(i >= 0 || j < positiveList.size()) {
            if(i < 0)
            {
                outputList.add(positiveList.get(j));
                j++;
                continue;
            }

            if(j >= positiveList.size())
            {
                outputList.add(negativeList.get(i));
                i--;
                continue;
            }

            if (negativeList.get(i) <= positiveList.get(j))
            {
                outputList.add(negativeList.get(i));
                i--;
            }
            else
            {
                outputList.add(positiveList.get(j));
                j++;
            }
        }
        return outputList;

    }
}
