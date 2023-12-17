import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        // write code here
        int res=0;
        int temp=0;
        int j=0;
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                if(temp>res){
                    res=temp;
                }
                set=new HashSet<Integer>();
                i=j+1;
                j++;
                temp=0;
            }
            temp++;
            set.add(arr[i]);
        }
        if(temp>res){
            res=temp;
        }

        return res;
    }
}