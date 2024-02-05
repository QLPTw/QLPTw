public class demo26 {
    public String reverseWords(String s){
        char[] str=s.toCharArray();
        char[] res=new char[str.length+1];
        int count=0;
        int i= str.length-1;
        while(i>=0){
            while(i>=0&&str[i]==' ')
                i--;
            int r=i;
            while(i>=0&&str[i]!=' ')
                i--;
            for (int j = i+1; j <=r ; j++) {
                res[count++]=str[j];
                if(j==r)
                    res[count++]=' ';
            }
        }
        return new String(res,0,count-1);
    }
}