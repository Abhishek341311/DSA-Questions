class Solution {
    public boolean isPowerOfFour(int n) {
        return isPowerOfTwo(n) && isSquare(n);
    }

    boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n - 1)) == 0);
    }

    boolean isSquare(int n) {
        int m = (int) Math.sqrt(n);
        return m * m == n;
    }
}