import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @return string字符串ArrayList
     */
    public void StrRes(ArrayList<String> res, char[] num, ArrayList<Character> temp,
                       boolean[] vis) {
        if (temp.size() == num.length) {
            StringBuilder s1 = new StringBuilder();
            for (Character character : temp) {
                s1.append(character);
            }
            res.add(s1.toString());
            return;
        } else {
            for (int i = 0; i < num.length; i++) {
                if (vis[i]) {
                    continue;
                }
                if (i > 0 && num[i] == num[i - 1] && !vis[i-1]) {
                    continue;
                }
                vis[i]=true;
                temp.add(num[i]);
                StrRes(res,num,temp,vis);
                vis[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
    public ArrayList<String> Permutation (String str) {
        // write code here
        ArrayList<String> res = new ArrayList();
        boolean[] vis = new boolean[str.length()];
        if (str.length() == 0) {
            return res;
        }
        char[] num = str.toCharArray();
        Arrays.sort(num);
        Arrays.fill(vis, false);
        ArrayList<Character> temp = new ArrayList();
        StrRes(res,num,temp,vis);
        return res;
    }
}