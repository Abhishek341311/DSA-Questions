// class Solution {
//     public int duplicateNumbersXOR(int[] nums) {
        
//         int ans = 0;

//         for(int i = 0; i < nums.length; i++){
//             int temp = nums[i];
//             for(int j = i + 1; j < nums.length; j++){
//                 if((temp ^ nums[j]) == 0) ans ^= temp;
//             }
//         }

//         return ans;
//     }
// }


class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(set.contains(num)) ans ^= num;
            else set.add(num);
        }

        return ans;
    }
}