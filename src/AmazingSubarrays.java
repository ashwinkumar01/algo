// https://www.interviewbit.com/problems/amazing-subarrays/
public class AmazingSubArrays {
    public int solve(String A) {
        int i, count = 0;

        String vowels = "aeiouAEIOU";

        for(i = 0; i < A.length(); i++)
        {
            if(vowels.indexOf(A.charAt(i)) >= 0)
            {
                count += A.length() - i;
            }
        }

        return count;

    }
}
