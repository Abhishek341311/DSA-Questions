class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int num : nums1) {
            if(num % 2 == 0) {
                minEven = Math.min(minEven, num);
            } else {
                minOdd = Math.min(minOdd, num);
            }
        }

        if(minOdd == Integer.MAX_VALUE || minEven == Integer.MAX_VALUE) {
            return true;
        }

        for(int num : nums1) {

            if(num % 2 == 0) {

                if(num - minOdd <= 0) {
                    return false;
                }
            }
        }

        return true;
    }
}