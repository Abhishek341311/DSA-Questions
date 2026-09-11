class Solution {
    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        // Count frequency of each digit
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;

        // Hundreds place
        for (int i = 1; i <= 9; i++) {

            // Tens place
            for (int j = 0; j <= 9; j++) {

                // Units place (must be even)
                for (int k = 0; k <= 8; k += 2) {

                    // Check if we have enough copies
                    int[] used = new int[10];

                    used[i]++;
                    used[j]++;
                    used[k]++;

                    boolean possible = true;

                    for (int d = 0; d <= 9; d++) {
                        if (used[d] > freq[d]) {
                            possible = false;
                            break;
                        }
                    }

                    if (possible) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}