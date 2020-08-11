public class RemoveConsecutiveChars {
    public static String solve(String A, int B) {
        int i, j;
        char checkChar;
        boolean isConsecutive = true;
        String returnStr = "";


        for(i = 0; i <= A.length()-B; i++)
        {
            checkChar = A.charAt(i);
            for(j = i+1; j < B-i; j++)
            {
                if (checkChar != A.charAt(j))
                {
                    isConsecutive = false;
                    break;
                }
            }

            if (!isConsecutive) {
                returnStr = returnStr + A.charAt(i);
            }
            i = i+B;
            isConsecutive = true;
        }

        return returnStr;
    }

    public static void main(String [] args) {
        System.out.print(solve("aabcd", 2));
    }
}