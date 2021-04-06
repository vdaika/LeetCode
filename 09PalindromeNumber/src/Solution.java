class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        if (x <= 9) return true;

        int[] arr = new int[10];

        int count = 0;
        while(x > 0) {
            arr[count++] = x % 10;
            x /= 10;
        }

        for (int i = 0; i <= count / 2; i++) {
            if (arr[i] != arr[count - 1 - i]) return false;
        }

        return true;
    }
}