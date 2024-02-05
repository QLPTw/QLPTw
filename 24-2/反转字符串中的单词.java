class Solution {
    public String reverseWords(String s) {
    String[] str=s.split(" ");
    StringBuilder res=new StringBuilder();
    for (int i= str.length-1;i>=0;i--){
        if (str[i].equals("")) continue;
        res.append(" "+str[i]);
    }
    return res.toString().trim();
    }
}