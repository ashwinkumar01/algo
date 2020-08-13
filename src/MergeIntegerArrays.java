// https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/
import java.util.ArrayList;

public class MergeIntegerArrays {
    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0, j = 0;

        while (i < a.size() || j < b.size())
        {
            if (j >= b.size() || i >= a.size())
            {
                a.addAll(b);
                break;
            }

            // insert the element at jth position of b to the ith position of a and shift all greater elements to the right
            if (b.get(j) <= a.get(i))
            {
                a.add(i, b.get(j));
                b.remove(j);
                i++;
            }
            // the element at the ith position of a belongs there, so we move to the next index
            else
                {
                i++;
            }
        }

    }

    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(-4);
        a.add(-3);
        a.add(0);

        b.add(2);

        merge(a, b);
        System.out.println();
    }
}
