import java.util.HashSet;

class Solution {
    public boolean hasAllCodes(String s, int k) {

        int total = 1 << k;

        if (s.length() < k) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();

        int bit = 0;

        for (int i = 0; i < k; i++) {
            bit = (bit << 1) | (s.charAt(i) - '0');
        }

        set.add(bit);

        int mask = total - 1;

        for (int i = k; i < s.length(); i++) {

            bit = ((bit << 1) | (s.charAt(i) - '0')) & mask;

            set.add(bit);
        }

        return set.size() == total;
    }
}