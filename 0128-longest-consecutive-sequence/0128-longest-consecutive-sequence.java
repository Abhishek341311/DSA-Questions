class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        int length = 0;

        for(int num: set){
            if(set.contains(num - 1)) continue;
            int count = 1;
            int target = num + 1;
            
            while(set.contains(target)){
                count++;
                target++;
            }

            length = Math.max(count, length);
        }

        return length;
    }
}