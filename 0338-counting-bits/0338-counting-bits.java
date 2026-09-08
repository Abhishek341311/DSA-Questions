// class Solution {
//     public int[] countBits(int n) {
        
//         int[] ans = new int[n + 1];

//         for(int i = 0; i <= n; i++){
//             int temp = i;
//             int count = 0;
//             while(temp != 0){
//                 int bit = temp & 1;
//                 if(bit == 1) count ++;
//                 temp = temp >>> 1;
//             }
//             ans[i] = count;
//         } 
        
//         return ans;
//     }
// }


class Solution {
    public int[] countBits(int n) {
        
        int[] ans = new int[n + 1];

        for(int i = 0; i <= n; i++){
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }
}