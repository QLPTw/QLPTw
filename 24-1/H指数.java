class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int res=0;
        sort(citations,0,n-1);
        for (int i = 0; i < n; i++) {
            if(citations[i]<i+1){
                break;
            }
            res++;
        }
        return res;
    }
    public void sort(int[] cs,int left,int right){
        int l=left,r=right;
        int temp=cs[left];
        while (left<right){
            while (left<right&&temp>cs[right])
                right--;

            cs[left]=cs[right];
            while (left<right&&temp<=cs[left])
                left++;

            cs[right]=cs[left];
        }
        cs[left]=temp;
        if(l<=left-1){
           sort(cs,l,left-1);
        }
        if (right+1<=r){
            sort(cs,right+1,r);
        }
    }
}