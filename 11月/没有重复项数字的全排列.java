import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param num int整型一维数组
     * @return int整型ArrayList<ArrayList<>>
     */
    private void swap(ArrayList<Integer> num, int i1, int i2) {
        int temp = num.get(i1);
        num.set(i1, num.get(i2));
        num.set(i2, temp);
    }

    public void recursion(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> num,
                          int index) {
        if(index==num.size()-1){
            res.add(num);
        }else{
            for(int i=index;i<num.size();i++){
                swap(num,i,index);
                recursion(res,num,index+1);
                swap(num,i,index);
            }
        }

    }

    public ArrayList<ArrayList<Integer>> permute (int[] num) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList();
        if (num.length == 0) {
            return res;
        }
        Arrays.sort(num);
        ArrayList<Integer> nums=new ArrayList();
        for(int i=0;i<num.length;i++){
            nums.add(num[i]);
        }
        recursion(res,nums,0);
        return res;
    }
}