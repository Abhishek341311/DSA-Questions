class Solution {
    public int minimumDeletions(int[] nums) {

        int min = 0;
        int max = 0;
        
        for(int i = 1; i < nums.length; i++){

            if(nums[max] < nums[i]) max = i;
            if(nums[min] > nums[i]) min = i;

        }

        int firstIdx;
        int lastIdx;

        if(min > max){
            firstIdx = max;
            lastIdx = min;
        }
        else{
            firstIdx = min;
            lastIdx = max;
        }


        int left = lastIdx + 1;
        int right = nums.length - firstIdx;

        int both = firstIdx + 1 + nums.length - lastIdx;

        return Math.min(left, Math.min(right, both));       
    }
}