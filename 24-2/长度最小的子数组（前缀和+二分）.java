class Solution {
    public int minSubArrayLen(int target, int[] nums){
        int n=nums.length,ans=n+10;
        int[] sum=new int[n+10];
        for (int i = 1; i <= n; i++) {
            sum[i]=sum[i-1]+nums[i-1];
        }
        for (int i = 1; i <= n; i++) {
            int d=sum[i]-target;
            int l=0,r=i;
            while (l<r){
                int mid=l+r+1>>1;
                if (sum[mid]<=d)
                    l=mid;
                else 
                    r=mid-1;
            }
            if (sum[r]<=d)
                ans=Math.min(ans,i-r);
        }
        return ans==n+10?0:ans;
    }
}