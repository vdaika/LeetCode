
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(intToRoman(1994));
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
	public static String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        
        while(num > 0) {
        	if (num >= 1000) {
        		s.append('M');
        		num -= 1000;
        	} else if (num >= 900) {
        		s.append("CM");
        		num -= 900;
        	} else if (num >= 500) {
        		s.append('D');
        		num -= 500;
        	} else if (num >= 400) {
        		s.append("CD");
        		num -= 400;
        	} else if (num >= 100) {
        		s.append('C');
        		num -= 100;
        	} else if (num >= 90) {
        		s.append("XC");
        		num -= 90;
        	} else if (num >= 50) {
        		s.append('L');
        		num -= 50;
        	} else if (num >= 40) {
        		s.append("XL");
        		num -= 40;
        	} else if (num >= 10) {
        		s.append('X');
        		num -= 10;
        	} else if (num >= 9) {
        		s.append("IX");
        		num -= 9;
        	} else if (num >= 5) {
        		s.append('V');
        		num -= 5;
        	} else if (num >= 4) {
        		s.append("IV");
        		num -= 4;
        	} else {
        		s.append('I');
        		num -= 1;
        	}
        }
		
		return s.toString();
    }
}
