class Solution {
    public int countSpecialIntegers(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
                } else
                    map.put(nums[i], 1);
            }
        }

        int ans = 0;

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                ans++;
            }
        }

        return ans;
    }
}