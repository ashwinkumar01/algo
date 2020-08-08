//https://www.interviewbit.com/problems/reverse-the-string/

public class ReverseString {
    public String solve(String A) {
        String[] words = A.split("\\s+");
        int i;
        String returnString = "";

        for(i = words.length-1; i >=0; i--) {
            returnString = returnString + " " + words[i];
        }

        return returnString.trim();
    }
}
