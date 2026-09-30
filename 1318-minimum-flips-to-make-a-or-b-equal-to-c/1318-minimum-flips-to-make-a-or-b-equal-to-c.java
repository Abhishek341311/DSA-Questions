class Solution {
    public int minFlips(int a, int b, int c) {

        int temp = a | b;

        if(temp == c) return 0;

        int flip = 0;

        for(int i = 0; i < 32; i++){
            
            int bit1 = temp & 1;
            int bit2 = c & 1;

            if(bit1 != bit2){
                if(bit1 == 0){
                    flip++;
                }
                else{
                    if(((a >> i) & 1) == ((b >> i) & 1)){
                        flip += 2;
                    }
                    else flip++;
                }
            }
            temp >>= 1;
            c >>= 1;
        }

        return flip;
        
    }
}