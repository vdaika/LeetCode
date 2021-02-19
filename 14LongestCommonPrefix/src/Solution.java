class Solution {
	public static void main(String args[]) {
		
	}
	
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
    	String cp = "";
    	
    	for (int i = 0; i < strs[0].length(); i++) {
    		char c = strs[0].charAt(i);
    		boolean isSame = false;
    		for (int run = 1; run < strs.length; run++) {
    			if(i >= strs[run].length() || strs[run].charAt(i) != c) {
    				isSame = false;
    				break;
    			} else {
                    isSame = true;
                }
    		}
    		if (isSame) {
    			cp += c;
    		} else {
                break;
            }
    	}
    	
        return cp;
    }
}