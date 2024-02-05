class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int num=1,k=0;
        int high=0,low=n-1,left=0,right=n-1;
        while (num<=n*n){
            while (k<=right){
                res[high][k++]=num++;
            }
            high+=1;
            k=high;
            while (k<=low){
                res[k++][right]=num++;
            }
            right-=1;
            k=right;
            while (k>=left){
                res[low][k--]=num++;
            }
            low-=1;
            k=low;
            while (k>=high){
                res[k--][left]=num++;
            }
            left+=1;
            k=left;
        }
        return res;
    }
}