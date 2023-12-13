import java.util.*;
import java.util.regex.Pattern;
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 验证IP地址
     * @param IP string字符串 一个IP地址字符串
     * @return string字符串
     */

    String solve(String IP) {
        String ipv4=
        "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Pattern ipv4_pattern = Pattern.compile(ipv4);
        String ipv6="([0-9a-fA-F]{1,4}\\:){7}[0-9a-fA-F]{1,4}";
        Pattern ipv6_pattern = Pattern.compile(ipv6);
        if (ipv4_pattern.matcher(IP).matches())
            return "IPv4";
        else if (ipv6_pattern.matcher(IP).matches())
            return "IPv6";
        else return "Neither";
    }
}