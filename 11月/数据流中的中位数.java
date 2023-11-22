import java.util.*;
public class Solution {
    private ArrayList<Integer> val = new ArrayList<Integer>();
    public void Insert(Integer num) {
        if(val.isEmpty())
            //val中没有数据，直接加入
            val.add(num); 
        //val中有数据，需要插入排序
        else{ 
            int i = 0;
            //遍历找到插入点
            for(; i < val.size(); i++){
                if(num <= val.get(i))
                   break;
            }
            //插入相应位置
            val.add(i, num); 
        }
    }

    public Double GetMedian() {
        int n = val.size();
        //奇数个数字
        if(n % 2 == 1) 
            //类型转换
            return (double)val.get(n / 2); 
        //偶数个数字
        else{ 
            double a = val.get(n / 2);
            double b = val.get(n / 2 - 1);
            return (a + b) / 2;
        }
    }
}