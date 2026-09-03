class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || numRows >= s.length()) return s;

        String[] row = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            row[i] = "";
        }

        int currentRow = 0;
        boolean direction = false;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(currentRow == 0){
                direction = false;
            }
            if(currentRow == numRows - 1){
                direction = true;
            }

            if(!direction){
                row[currentRow++] += ch;
            }
            else{
                row[currentRow--] += ch;
            } 

        }

        String ans = "";

        for(int i = 0; i < row.length; i++){
            ans += row[i];
        }

        return ans;

    }
}