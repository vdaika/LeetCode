class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sBuffer = new StringBuilder();

        int len = s.length();

        char[][] c = new char[numRows][len];
        int i = 0, j = 0;
        int count = 0;
        int direct = 1;
        while (count < len) {
            c[i][j] = s.charAt(count);
            count++;
            if (direct == -1) {
                j++;
                i--;
            } else {
                i++;
            }
            if (i == numRows - 1) {
                direct = -1;
            }
            if (i == 0) {
                direct = 1;
            }
        }

        for (int x = 0; x < numRows; x++) {
            for (int y = 0; y < len; y++) {
                if (c[x][y] != 0) {
                    sBuffer.append(c[x][y]);
                }
            }
        }

        return sBuffer.toString();
    }
}