class Solution {
    public int reverse(int x) {
        if (x == 0 || x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) return 0;

        long tmp = 0;

        while (x != 0) {
            tmp = tmp * 10 + x % 10;
            if (tmp >= Integer.MAX_VALUE || tmp <= Integer.MIN_VALUE) return 0;
            x /= 10;
        }

        return (int)tmp;
    }
}