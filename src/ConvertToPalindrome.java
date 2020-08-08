//https://www.interviewbit.com/problems/convert-to-palindrome/
// had to step through the debugger to fix an edge case

public class ConvertToPalindrome {
    public static int solve(String A) {
        int i = 0, j = A.length() - 1;
        boolean isCharRemoved = false;

        while (i < j) {
            if (A.charAt(i) != A.charAt(j)) {
                if (isCharRemoved) {
                    return 0;
                }

                if (i + 1 == j) {
                    return 1;
                }

                if (A.charAt(i + 1) == A.charAt(j)) {
                    isCharRemoved = true;
                    i++;
                }

                else if (A.charAt(i) == A.charAt(j - 1)) {
                    isCharRemoved = true;
                    j--;
                }

                else {
                    return 0;
                }
            }

            i++;
            j--;
        }

        return 1;
    }

    public static void main(String[] args) {
        solve("ivjwvi");
    }
}
