import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param number int整型 
     * @return int整型
     */
    public int jumpFloor (int number) {
        // write code here
        int sum=0;
        if(number==0){
            return 1;
        }
        if(number>=1){
            sum=sum+jumpFloor(number-1);
        }
        if(number>=2){
            sum=sum+jumpFloor(number-2);
        }
        return sum;
    }
}