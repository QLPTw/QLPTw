public class demo28 {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        int numlen = numRows * 2 - 2;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += numlen) {
                res.append(s.charAt(j));
                //用来计算存入中间那些数的
                if (i > 0 && i < numRows - 1) {
                    int temp = j + numlen - 2 * i;
                    if (temp < s.length()) {
                        res.append(s.charAt(temp));
                    }
                }
            }
        }

        return res.toString();
    }
}
