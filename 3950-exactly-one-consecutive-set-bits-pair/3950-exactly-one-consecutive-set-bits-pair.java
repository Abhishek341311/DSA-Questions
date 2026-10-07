class Solution {
    public boolean consecutiveSetBits(int n) {

        int count = 0;
        int prev = 0;

        while (n > 0) {

            int bit = n & 1;

            if (bit == 1 && prev == 1) {
                count ++;
            } 

            prev = bit;

            n >>= 1;
        }

        return count == 1;
    }
}