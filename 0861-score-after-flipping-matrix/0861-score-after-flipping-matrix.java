class Solution {
    public int matrixScore(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i < n; i++){
            if(grid[i][0] == 0){
                for(int j = 0; j < m; j++){
                    grid[i][j] ^=  1;
                }
            }
        }
        

        for(int j = 0; j < m; j++){
            int zero = 0;

            for(int i = 0; i < n; i ++){
                if(grid[i][j] == 0) zero++;
            }

            if(zero > n / 2){
                for(int i = 0; i < n; i++){
                    grid[i][j] ^= 1;
                }
            }
        }


        int sum = 0;
        int pow = 1;

        for(int j = m - 1; j >= 0; j--){
            int one = 0;

            for(int i = 0; i < n; i ++){
                if(grid[i][j] == 1) one++;
            }

            sum += one * pow;
            pow *= 2;
        }

        return sum;
        
        
    }
}