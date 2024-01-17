public class kuaipai{
    public void  kaipai(int[] arr,int l,int r){
        int left=l,right=r;
        int temp=arr[left];
        while (left<right){
            while (left<right&&arr[right]>temp)
                right--;
            arr[left]=arr[right];
            while (right>left&&arr[left]<temp)
                left++;
            arr[right]=arr[left];
        }
        arr[left]=temp;
        if (l<=left-1){
            kaipai(arr,l,left-1);
        }
        if(right+1<=r){
            kaipai(arr,right+1,r);
        }
    }
}