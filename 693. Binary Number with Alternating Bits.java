class Solution {
    public boolean hasAlternatingBits(int n) {
        int[] binary = new int[20000];
        int i = 0;
        while(n > 0) {
            int r = n % 2;
            binary[i++] = r;
            n /= 2;
        }
        for(int j = 0; j < i - 1; j++) {
            if(binary[j] == binary[j+1]) {
            return false;
            }
        }
        return true;
    }
}
