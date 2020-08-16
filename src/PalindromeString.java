//https://www.interviewbit.com/problems/palindrome-string/
/*
Determine if a string is a palindrome considering only alphanumeric characters
"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.
 */
public class PalindromeString
{
    public static int isPalindrome(String A) {
        int i = 0, j = A.length()-1;

        if(A.length() == 1)
            return 1;

        A = A.toLowerCase();

        while(i < j)
        {
            if(!Character.isLetter(A.charAt(i)) && !Character.isDigit(A.charAt(i)))
            {
                i++;
                continue;
            }

            if(!Character.isLetter(A.charAt(j)) && !Character.isDigit(A.charAt(j)))
            {
                j--;
                continue;
            }

            if (A.charAt(i) != A.charAt(j))
                return 0;
            i++;
            j--;
        }

        return 1;

    }

    public static void main(String [] args)
    {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // returns 1
        System.out.println(isPalindrome("1a2")); // returns 0
        System.out.println(isPalindrome("racecar")); //returns 1
    }
}