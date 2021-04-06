class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0;
        int sign = 1;
        boolean isNumber = false;
        StringBuilder sBuffer = new StringBuilder();
        while(true) {
            char c = s.charAt(0);
                if((c == '+' || c == '-') && !isNumber) {
                if (c == '-') {
                    sign = -1;
                }

                if (s.length() > 1) {
                    char next = s.charAt(1);
                    if (next < '0' || next >'9') break;
                }
            } else if(c >= '0' && c <= '9') {
                sBuffer.append(c);
                isNumber = true;
            } else {
                break;
            }

            if (s.length() > 1) {
                s = s.substring(1);
            } else {
                break;
            }
        }
        if (sBuffer.length() == 0) return 0;

        long res = 0;
        try {
            res = Long.parseLong(sBuffer.toString()) * sign;
        } catch (Exception ex) {
            if (sign > 0) res = Integer.MAX_VALUE;
            if (sign < 0) res = Integer.MIN_VALUE;
        }
        if (res < Integer.MIN_VALUE) res = Integer.MIN_VALUE;
        else if(res > Integer.MAX_VALUE) res = Integer.MAX_VALUE;

        return (int) res;
    }
}