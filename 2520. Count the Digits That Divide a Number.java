class Solution {
    public int countDigits(int num) {
        int c=0;
        for(int i = num; i > 0; i /= 10)
        {
            if(num % (i % 10) == 0)
            {
                c++;
            }
        }
        return c;
    }
}
