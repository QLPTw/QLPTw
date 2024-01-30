public class demo10 {
    public int jump(int[] nums) {
        int len = nums.length-1;
        int step=0;
        while (len!=0){
            for (int i = 0; i < len; i++) {
                if(nums[i]>=len-i){
                    len=i;
                    step++;
                    break;
                }
            }
        }
        return step;
    }
}
