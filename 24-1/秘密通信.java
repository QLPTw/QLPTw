import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return bool布尔型
     */
    public boolean is_valid_cow_communication (String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                char cp = stack.pop();
                if ((c == '}') && cp != '{' || (c == ']') && cp != '['
                        || (c == ')') && cp != '(') {
                    return false;
                }
            }
        }
        return true;
    }
}
