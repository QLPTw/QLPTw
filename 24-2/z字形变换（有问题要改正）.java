public class demo27 {
    //内存超出
    public String convert(String s, int numRows) {
        int numlen=numRows*2-2;
        StringBuilder res=new StringBuilder();
        int temp=0;
        while(temp<s.length()){
            res.append(s.charAt(temp));
            temp+=numlen;
        }
        int left=1,right=numlen-1;
        temp=0;
        while (left<numRows&&right>numRows){
            while(left+temp<s.length()){
                res.append(s.charAt(left+temp));
                if(right+temp<s.length()){
                    res.append(s.charAt(right+temp));
                }
                temp+=numlen;
            }
            left++;right--;
        }
        temp=0;
        while (numRows+temp<s.length()){
            res.append(s.charAt(numRows+temp));
            temp+=numlen;
        }
        return res.toString();
    }
}
