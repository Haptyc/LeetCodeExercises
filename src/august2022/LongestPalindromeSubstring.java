package august2022;

public class LongestPalindromeSubstring {
    public static String longestPalindrome(String str) {
        int n = str.length(), maxLength = 1, start = 0;
        int low, high;
        if (str.length() < 1 || str.length() > 1000) {
            return "null";
        } else {
            for (int i = 0; i < n; i++) {
                low = i - 1;
                high = i + 1;
                while (high < n && str.charAt(high) == str.charAt(i)) //increment 'high'
                    high++;

                while (low >= 0 && str.charAt(low) == str.charAt(i)) // decrement 'low'
                    low--;

                while (low >= 0 && high < n && str.charAt(low) == str.charAt(high)) {
                    low--;
                    high++;
                }

                int length = high - low - 1;
                if (maxLength < length) {
                    maxLength = length;
                    start = low + 1;
                }
            }

        }
        return str.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String palindrome = longestPalindrome("babad");
        if(palindrome.equals("null"))
            System.out.println("0");
        else
            System.out.println(palindrome);
    }
}
