import org.jetbrains.annotations.NotNull;

public class EditDistance {
    public static void main(String [] args) {
       System.out.println(minDistance("bbbaabaa", "aababbabb"));
       System.out.println(minDistance("aaa", "aa"));
       System.out.println(minDistance("aac", "abac"));

    }

    static int minDistance(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        int i, j, replaceChar, insertChar, deleteChar, minChar;

        int[][] minDistanceArr = new int[lenA + 1][lenB + 1];

        for (i = 0; i <= lenA; i++)
        {
            minDistanceArr[i][0] = i;
        }

        for (j = 0; j <= lenB; j++)
        {
            minDistanceArr[0][j] = j;
        }

        for (i = 0; i < lenA; i++)
        {
            for (j = 0; j < lenB; j++)
            {
                //if last two chars equal
                if (A.charAt(i) == B.charAt(j))
                {
                    minDistanceArr[i + 1][j + 1] = minDistanceArr[i][j];
                }
                else {
                    replaceChar = minDistanceArr[i][j] + 1;
                    insertChar = minDistanceArr[i][j + 1] + 1;
                    deleteChar = minDistanceArr[i + 1][j] + 1;

                    minChar = Math.min(replaceChar, insertChar);
                    minChar = Math.min(deleteChar, minChar);
                    minDistanceArr[i + 1][j + 1] = minChar;
                }
            }
        }

        return minDistanceArr[lenA][lenB];
    }
}
