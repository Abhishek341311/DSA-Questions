class Solution {
    public int binaryGap(int n) {

        int ans = 0;
        int count = 0;
        boolean flag = false;

        while(n != 0){
            int bit = n & 1;
            n = n >> 1;
            
            if(flag) count++;
            
            if(flag && bit != 0){
                ans = Math.max(ans,count);
                count = 0;
            }

            if(bit != 0) flag = true;            
        }

        return ans;

        
    }
}