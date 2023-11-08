import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        // 特殊情况判断
        if (array.length== 0) {
            return 0;
        }
        // 左右指针i j
        int i = 0, j = array.length - 1;
        // 循环
        while (i < j) {
            // 找到数组的中点 m
            int m = (i + j) / 2;
            // m在左排序数组中，旋转点在 [m+1, j] 中
            if (array[m] > array[j]) i = m + 1;
            // m 在右排序数组中，旋转点在 [i, m]中
            else if (array[m] < array[j]) j = m;
            // 缩小范围继续判断
            else j--;
        }
        // 返回旋转点
        return array[i];
    }
}