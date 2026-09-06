class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int l = 0;
        int m = 0;

        arr1[l++] = nums[0];
        arr2[m++] = nums[1];

        for (int i = 2; i < n; i++) {

            if (arr1[l - 1] > arr2[m - 1]) {
                arr1[l++] = nums[i];
            } else {
                arr2[m++] = nums[i];
            }
        }

        int index = 0;

        for (int i = 0; i < l; i++) {
            nums[index++] = arr1[i];
        }

        for (int i = 0; i < m; i++) {
            nums[index++] = arr2[i];
        }

        return nums;
    }
}