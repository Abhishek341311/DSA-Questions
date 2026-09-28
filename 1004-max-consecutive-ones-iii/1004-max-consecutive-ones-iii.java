class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int ans = 0;
        int i = 0;
        int n = nums.length;
        for(int j = 0; j < n; j++){
            if(nums[j] == 0){
                count++;
            }
            while(count > k){
                if(nums[i] == 0) count--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}



// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int count = 0;
//         int ans = 0;
//         int i = 0;
//         int n = nums.length;
//         for(int j = 0; j < n; j++){
//             if(nums[j] == 0){
//                 count++;
//             }
//             if(count > k){
//                 if(nums[i] == 0) count--;
//                 i++;
//             }
//             ans = Math.max(ans, j-i+1);
//         }
//         return ans;
//     }
// }





// class Solution {
//     public int longestOnes(int[] nums, int k) {
        
//         int count = 0;
//         int ans = 0;
//         int i = 0;


//         for(int j = 0; j < nums.length; j++){

//             if(nums[j] == 0){
//                 count ++;
//             }

//             while(count >= k){
//                 if(nums[i] == 0){
//                     count --;
//                 }
//                 i++;
//             }
            
            
//             ans = Math.max(ans, j - i + 1);
//         }
//         return ans;
//     }
// }