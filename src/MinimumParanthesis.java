// https://www.interviewbit.com/problems/minimum-parantheses/

public class MinimumParanthesis {
    public int solve(String A) {
        if (A.length() == 0) {
            return 0;
        }

        int i;
        int bracketCount = 0, extraCloseBracketCount = 0;

        for(i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '('){
                bracketCount++;
            }
            else if (A.charAt(i) == ')') {
                if (bracketCount > 0)
                    bracketCount --;
                else
                    extraCloseBracketCount++;
            }

        }

        return bracketCount+extraCloseBracketCount;
    }
}