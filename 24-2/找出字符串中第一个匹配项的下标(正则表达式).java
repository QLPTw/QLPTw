import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int strStr(String haystack, String needle) {
        Pattern pattern = Pattern.compile(needle);
        Matcher matcher = pattern.matcher(haystack);

        if (matcher.find()) {
            return matcher.start();
        } else {
            return -1; // 没有找到匹配项
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "Hello, this is a test string.";
        String needle = "is";

        int index = solution.strStr(haystack, needle);
        System.out.println("Match found at index: " + index);
    }
}
