class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int temp=nums.length;
        reverse(nums,0,temp-1);
        reverse(nums,k,temp-1);
        reverse(nums,0,k-1);
    }
    public void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}