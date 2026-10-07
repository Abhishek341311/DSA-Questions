class Solution {
    public boolean hasAllCodes(String s, int k) {

        HashSet<Integer> set = new HashSet<>();

        int limit = 1 << k;

        for (int i = 0; i < limit; i++) {
            set.add(i);
        }

        for (int i = 0; i <= s.length() - k; i++) {

            int bit = 0;

            for (int j = i; j < i + k; j++) {

                int temp = s.charAt(j) - '0';

                bit = (bit << 1) | temp;
            }

            set.remove(bit);
        }

        return set.isEmpty();
    }
}