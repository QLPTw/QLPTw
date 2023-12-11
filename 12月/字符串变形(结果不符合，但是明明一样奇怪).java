public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @param n int整型
     * @return string字符串
     */
    public String trans(String s, int n) {
        if (n == 0) {
            return s;
        }
        StringBuilder res01 = new StringBuilder();
        String[] str = s.split("\\s+");
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].isEmpty()) {
                res01.append(str[i]);
                if (i > 0) {
                    res01.append(" ");
                }
            } else {
                res01.append(" ");
            }
        }
        int cha = 'A' - 'a';
        StringBuilder res02 = new StringBuilder();
        int i = n - 1;
        while (s.charAt(i) == ' ') {
            res02.append(" ");
            i--;
        }

        for (int j = 0; j < n && j < res01.length(); j++) {
            char temp = res01.charAt(j);
            if (temp == ' ') {
                res02.append(' ');
            } else if (temp <= 'z' && temp >= 'a') {
                res02.append((char) (temp + cha));
            } else if (temp <= 'Z' && temp >= 'A') {
                res02.append((char) (temp - cha));
            }
        }
        i = 0;
        while (s.charAt(i) == ' ') {
            res02.append(" ");
            i++;
        }

        return res02.toString();
    }
}
