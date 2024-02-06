class Solution {
    public boolean validUtf8(int[] data) {
        for (int i = 0; i < data.length;) {
            int n = 0;
            if (data[i] >= 240 &&data[i]<=247) {
                n = 4;
            } else if (data[i] >= 224 &&data[i]<=239) {
                n = 3;
            } else if (data[i] >= 192 &&data[i]<=223) {
                n = 2;
            } else if (data[i] <= 127) {
                n = 1;
            } else {
                return false;
            }
            if (data.length < n + i) {
                return false;
            }
            for (int j = 1; j < n; j++) {
                if (data[j + i] <128||data[j+i]>191) {
                    return false;
                }
            }
            i += n;
        }
        return true;
    }
}
// 11110000 = 240
// 11100000 = 224
// 11000000 = 192
// 10000000 = 128
// 第一个字节 01111111 的二进制表示对应的十进制数为 127。
// 第二个字节 10111111 的二进制表示对应的十进制数为 191。
// 第三个字节 11011111 的二进制表示对应的十进制数为 223。
// 第四个字节 11101111 的二进制表示对应的十进制数为 239。
// 第五个字节 11110111 的二进制表示对应的十进制数为 247。