public  class Quike{
    public static void QuikeSort(int[] arr,int left,int right){
        int l=left;//左下标
        int r=right;//右下标
        //pivot中轴值
        int pivot =arr[(left+right)/2];
        int temp=0;//临时变量，作为交换使用
        while(l<r){
            //在pivot值小的放到左边，比它大的放到右边
            while (arr[l]<pivot){
                l+=1;
            }
            //在pivot值的左边一直找，找到岛屿等于pivot值才退出
            while (arr[r]>pivot){
                r-=1;
            }
            //如果l>=r说明pivot的左右两的值，已经按照左边全部小于等于pivot右边全是大于等于
            if(l>=r){
                break;
            }
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            //如果交换完后，发现这个arr[l]==pivot值相等r--
            //如果交换完后，发现这个arr[r]==pivot值相等l++
            if(arr[l]==pivot){
                r-=1;
            }
            if(arr[r]==pivot){
                l+=1;
            }
            if(l==r){
                l+=1;
                r-=1;
            }
        }
        //向左递归
        if(left<r){
            QuikeSort(arr,l,right);
        }
        //向右递归
        if(right>l){
            QuikeSort(arr,left,r);
        }
    }
}