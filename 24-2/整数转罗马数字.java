class Solution {
    public String intToRoman(int num) {
     StringBuilder res=new StringBuilder();
     int[] ars={1000,900,500,400,100,90,50,40,10,9,5,4,1};
     String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for (int i = 0; i <ars.length; i++) {
            int temp=ars[i];
            while (temp<=num){
                num-=temp;
                res.append(str[i]);
            }
        }
     return res.toString();
    }
}