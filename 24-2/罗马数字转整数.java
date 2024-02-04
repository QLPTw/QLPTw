public class demo20 {
    public int romanToInt(String s) {
        int[] res = new int[s.length()];
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    res[i] = 1;
                    break;
                case 'V':
                    res[i] = 5;
                    break;
                case 'X':
                    res[i] = 10;
                    break;
                case 'L':
                    res[i] = 50;
                    break;
                case 'C':
                    res[i] = 100;
                    break;
                case 'D':
                    res[i] = 500;
                    break;
                case 'M':
                    res[i] = 1000;
                    break;
            }
        }
        for (int j = 0; j < res.length - 1; j++) {
            if(res[j]<res[j+1]){
                temp-=res[j];
            }else {
                temp+=res[j];
            }
        }
        temp+=res[res.length-1];
        return temp;
    }
}
