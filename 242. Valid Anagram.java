class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int m = s.length();
        int n = t.length();
        for(int i = 0; i < m; i++) {
            count1[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < n; i++) {
            count2[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(count1[i] != count2[i]) {
                return false;
            } 
        } 
        return true;
    }
}
