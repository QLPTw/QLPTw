import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
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
                if (i > 0 && num[i] == num[i - 1] && !vis[i - 1]) {
                    continue;
                }
                vis[i] = true;
                temp.add(num[i]);
                StrRes(res, num, temp, vis);
                vis[i] = false;
                temp.remove(temp.size() - 1);
                while (i + 1 < num.length && num[i] == num[i + 1]) {
                    i++;
                }
            }
        }
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        boolean[] vis = new boolean[str.length()];
        Arrays.fill(vis, false);
        if (str.length() == 0) {
            return res;
        }
        char[] num = str.toCharArray();
        Arrays.sort(num);
        ArrayList<Character> temp = new ArrayList<>();
        StrRes(res, num, temp, vis);
        return res;
    }
}
