class Solution {
    public String longestPalindrome(String s) {
        String palindrome = s.charAt(0) + "";

        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            while (j <= i && i + j < s.length()) {
                if (s.charAt(i - j) == s.charAt(i + j)) {
                    j++;
                } else {
                    break;
                }
            }
            String tmp = s.substring(i - j + 1, i + j);
            if (palindrome.length() < tmp.length()) {
                palindrome = tmp;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            while (j <= i && i + j + 1 < s.length()) {
                if (s.charAt(i - j) == s.charAt(i + j + 1)) {
                    j++;
                } else {
                    break;
                }
            }
            String tmp = s.substring(i - j + 1, i + j + 1);
            if (palindrome.length() < tmp.length()) {
                palindrome = tmp;
            }
        }
        return palindrome;
    }
}