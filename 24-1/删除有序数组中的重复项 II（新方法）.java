class Solution {
    public static int removeDuplicates(int[] nums) {
        int p=0,q=2;
        while (q< nums.length){
            if(nums[p]!=nums[q]){
                if(q-p>2)
                nums[p+2]=nums[q];
                p++;
            }
            q++;
        }
        return p+2;
    }
}