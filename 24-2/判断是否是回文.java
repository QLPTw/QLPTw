import java.util.List;

public class demo31 {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z')||(ch >= '0'&&ch<='9')) {
                str.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                str.append((char)(ch+32));
            }
        }
        System.out.println(str.toString());
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
