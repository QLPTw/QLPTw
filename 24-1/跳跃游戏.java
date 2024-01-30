public class demo9 {
    public boolean canJump(int[] nums) {
        int temp=-1;
        for (int i = 0; i < nums.length-1; i++) {
            temp=Math.max(nums[i], temp-1);
            if(!(temp>0)){
                return false;
            }
        }
        return true;
    }
}
