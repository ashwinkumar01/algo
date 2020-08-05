// https://www.interviewbit.com/problems/implement-strstr/
public class StrStr {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        int lenB = B.length();
        int lenA = A.length();
        int idx;

        if (lenB > lenA){
            return -1;
        }

        for(int i = 0; i < lenA; i++) {
            idx = A.indexOf(B, i);

            if (idx != -1)
                return idx;
        }

        return -1;
    }
}