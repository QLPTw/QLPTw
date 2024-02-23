class Solution {
    public int minSubArrayLen(int target, int[] nums){
        int[] ans=new int[nums.length];
        ans[0]=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>=nums[i-1]){
                ans[i]=ans[i-1]+1;
            }else {
                ans[i]=1;
            }
        }
        Arrays.sort(ans);
        return ans[nums.length-1]>=target?ans[nums.length-1] :0 ;
    }
}