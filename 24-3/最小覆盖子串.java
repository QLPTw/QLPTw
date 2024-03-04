class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), tot = 0;
        int[] c1 = new int[60], c2 = new int[60];
        for (char x : t.toCharArray()) {
            if (++c1[getIdx(x)] == 1) tot++;
        }
        String ans = "";
        for (int i = 0, j = 0; i < n; i++) {
            int idx1 = getIdx(s.charAt(i));
            if (++c2[idx1] == c1[idx1]) tot--;
            while (j < i) {
                int idx2 = getIdx(s.charAt(j));
                if (c2[idx2] > c1[idx2] && --c2[idx2] >= 0) j++;
                else break;
            }
            if (tot == 0 && (ans.length() == 0 || ans.length() > i - j + 1)) ans = s.substring(j, i + 1);
        }
        return ans;
    }
    int getIdx(char x) {
        return x >= 'A' && x <= 'Z' ? x - 'A' + 26 : x - 'a';
    }
}

