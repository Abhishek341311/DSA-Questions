class Solution {
    public int[] sortByBits(int[] arr) {

        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int freq = 0;
            int temp = arr[i];

            while (temp != 0) {
                int bit = temp & 1;
                if (bit != 0)
                    freq++;
                temp >>= 1;
            }

            count[i] = freq;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (count[i] > count[j] ||
                        (count[i] == count[j] && arr[i] > arr[j])) {

                    // swap count
                    int tempCount = count[i];
                    count[i] = count[j];
                    count[j] = tempCount;

                    // swap arr
                    int tempArr = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempArr;
                }
            }
        }
        return arr;
    }
}