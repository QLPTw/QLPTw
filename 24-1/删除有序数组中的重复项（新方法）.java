class Solution {
    public int removeDuplicates(int[] nums) {
        int p=0,q=p+1;
        while(q<nums.length){
            if(nums[p]!=nums[q]){
                if(q-p>1)
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return  p+1;
    }
}