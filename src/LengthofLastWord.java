// https://www.interviewbit.com/problems/length-of-last-word/

public class LengthofLastWord {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int i, count = 0;
        if (A.indexOf(' ') == -1)
            return A.length();

        String trimA = A.trim();

        for(i = trimA.length() - 1; i >= 0; i--)
        {
            if(trimA.charAt(i) == ' ')
                break;

            count++;
        }

        return count;
    }
}