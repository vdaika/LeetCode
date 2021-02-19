
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int maxArea(int[] height) {
    	int area = 0;
    	
    	for (int i = 0; i < height.length; i++) {
    		for (int j = i + 1; j < height.length; j++) {
    			int tmp = (j - i) * (Math.min(height[i], height[j]));
    			if (area < tmp) {
    				area = tmp;
    			}
    		}
    	}
    	
        return area;
    }
}
