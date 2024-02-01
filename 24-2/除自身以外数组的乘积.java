public class demo13 {
    public int[] productExceptSelf(int[] nums) {
        int len= nums.length;
        int[] ars=new int[len];
        ars[0]=1;
        for (int i = 1; i < len; i++) {
            ars[i]=ars[i-1]*nums[i-1];
        }
        int temp=1;
        for (int i = len-2; i>-1 ; i++) {
            temp*=nums[i+1];
            ars[i]*=temp;
        }
        return ars;
    }
}