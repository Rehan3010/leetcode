class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mn = nums[0];
        int mx = nums[n-1];
        while(mn != mx) {
            if(mn > mx) {
                mn -= mx; 
            }else{
                mx -= mn;
            }
        }
        return mn;
    }
}
