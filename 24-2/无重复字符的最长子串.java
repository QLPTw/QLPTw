public class demo41 {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int len=s.length();
        int[] freq=new int[256];
        int l=0,r=-1;
        while(l<len){
            if(r+1<len&&freq[s.charAt(r+1)]==0){
                freq[s.charAt(++r)]++;
            }else {
                freq[s.charAt(l++)]--;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
