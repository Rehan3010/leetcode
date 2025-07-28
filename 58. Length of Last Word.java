class Solution {
    public int lengthOfLastWord(String s) {
        boolean flag = false;
        char[] S = s.toCharArray();
        int n = S.length;
        int count = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(S[i] != ' ') {
                flag = true;
                count++;
            }
            else if(S[i] == ' ' && flag == true) {
                break;
            }
        }
        return count;
    }
}
