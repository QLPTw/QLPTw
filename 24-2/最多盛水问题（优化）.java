class Solution {
    public int maxArea(int[] height) {
        int max = 0,lin=0;
        int left = 0, right = height.length-1;
        while (left < right) {
            if(Math.min(height[left],height[right])>lin) {
                lin=Math.min(height[left],height[right]);
                max = Math.max(max, (right - left) * lin);
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}