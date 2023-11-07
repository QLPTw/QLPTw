import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param nums int整型一维数组 
     * @return int整型
     */
     public int mod=1000000007;
    public int InversePairs (int[] nums) {
        // write code here
        if(nums.length<=1){
            return 0;
        }
        int[] temp=new int[nums.length];
        return BinarySearch(0,nums.length-1,nums,temp);
    }

    public int BinarySearch(int left,int right,int[] nums,int[] temp){
     if(left>=right){
        return 0;
     }
     int sum=0;
     int mid=(left+right)/2;
     
     sum=BinarySearch(left,mid,nums,temp)+BinarySearch(mid+1,right,nums,temp);
     sum%=mod;
     if(nums[mid]<nums[mid+1]){
        return sum+0;
     }
     
     for(int k=left;k<=right;k++){
        temp[k]=nums[k];
     }
     int i=left,j=mid+1;
     for(int k=left;k<=right;k++){
        if(i==mid+1){
            nums[k]=temp[j++];
        }else if(j==right+1||temp[i]<=temp[j]){
            nums[k]=temp[i++];
        }else{
            nums[k]=temp[j++];
            sum+=mid-i+1;
        }
     }

     return sum%mod;
    }
}