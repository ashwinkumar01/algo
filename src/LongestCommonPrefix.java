// https://www.interviewbit.com/problems/longest-common-prefix/

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(ArrayList<String> A) {
        String prefix = A.get(0);
        int i;

        if (A.size() == 0)
            return "";

        for (i = 1; i < A.size(); i++)
        {
            if(prefix.length() == 0)
                return "";

            if ( prefix.length() > A.get(i).length() || !prefix.equals( A.get(i).substring( 0, prefix.length() ) ) )
            {
                prefix = prefix.substring(0, prefix.length()-1);
                i--;
            }
        }

        return prefix;
    }

    public static void main(String [] args)
    {
        ArrayList<String> words = new ArrayList<>();
//        words.add("abcd");
//        words.add("abcd");
//        words.add("efgh");

        words.add("abcd");
        words.add("abdf");
        words.add("abcf");
        System.out.println(longestCommonPrefix(words));
    }

}