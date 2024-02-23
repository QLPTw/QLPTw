class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length,ans=n+1,s=0,left=0;
        for (int right=0;right<n;++right){
            s+=nums[right];
            while (s-nums[left]>=target)
                s-=nums[left++];
            if (s>=target)
                ans=Math.min(ans,right-left+1);
            while (s>=target){
                ans=Math.min(ans,right-left+1);
                s-=nums[left++];
            }
        }
        return ans<=n?ans:0;
    }
}