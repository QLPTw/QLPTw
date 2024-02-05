import java.util.Arrays;

public class demo24 {
    public static void main(String[] args) {
        String[] str={"abcd","abvc","abcdef"};
        //abcd
        //abcdef
        //abvc
        demo24.longestCommonPrefix(str);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return  "";
        }
        Arrays.sort(strs);
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        String start=strs[0];
        String end=strs[strs.length-1];
        int i;
        int num=Math.min(start.length(), end.length());
        for (i = 0; i <num&& start.charAt(i)==end.charAt(i) ; i++);
        String res=start.substring(0,i);
        return res;
    }
}
