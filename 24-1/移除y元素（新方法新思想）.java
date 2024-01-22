class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int j=len-1;
        for(int i=0;i<=j;i++){
          if(nums[i]==val){
              swap(nums,i--,j--);
          }  
        }
        return j+1;
    }
    public void swap(int[] nums,int p1,int p2){
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}