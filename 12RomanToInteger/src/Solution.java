
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(romanToInt("XXX"));
	}
//	I             1
//	V             5
//	X             10
//	L             50
//	C             100
//	D             500
//	M             1000

//    I can be placed before V (5) and X (10) to make 4 and 9. 
//    X can be placed before L (50) and C (100) to make 40 and 90. 
//    C can be placed before D (500) and M (1000) to make 400 and 900.

	
    public static int romanToInt(String s) {
    	int value = 0;
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if (c == 'M') {
    			value += 1000;
    		} else if (c == 'D') {
    			value += 500;
    		} else if (c == 'C') {
    			if (i + 1 < s.length() && (s.charAt(i + 1) == 'M' || s.charAt(i + 1) == 'D')) {
    				value -= 100;
    			} else {
    				value += 100;
    			}
    		} else if (c == 'L') {
    			value += 50;
    		} else if (c == 'X') {
    			if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
    				value -= 10;
    			} else {
    				value += 10;
    			}
    		} else if (c == 'V') {
    			value += 5;
    		} else if (c == 'I') {
    			if (i + 1 < s.length() && (s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'V')) {
    				value -= 1;
    			} else {
    				value += 1;
    			}
    		}
    	}
    	
		return value;
    }
}
