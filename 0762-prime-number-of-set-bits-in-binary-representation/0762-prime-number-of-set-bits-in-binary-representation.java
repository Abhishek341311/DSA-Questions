class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        int ans = 0;

        for(int i = left; i <= right; i++){
            int noOfOnce = 0;
            int temp =  i;

            while(temp != 0){
                if((temp & 1) == 1) noOfOnce++;
                temp >>= 1;
            }

            if(isPrime(noOfOnce)) ans++;
        }

        return ans;

    }
    public boolean isPrime(int n){
         if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}