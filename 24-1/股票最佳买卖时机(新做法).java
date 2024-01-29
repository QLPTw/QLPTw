public int maxProfit(int[] prices) {
       int temp=Integer.MAX_VALUE,res=0;
       for(int price:prices){
           temp=Math.min(temp,price);
           res=Math.max(res,price-temp);
       }
       return res;
    }