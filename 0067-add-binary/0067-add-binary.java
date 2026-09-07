// class Solution {
//     public String addBinary(String a, String b) {

//         String ans = "";

//         int i = a.length() - 1;
//         int j = b.length() - 1;
//         int carry = 0;
        
//         while(i >= 0 && j >= 0){
            
//             int x = a.charAt(i) - '0';
//             int y = b.charAt(j) - '0';

//             int sum = x + y + carry;

//             ans = (sum % 2) + ans;
//             carry = sum / 2;

//             i--;
//             j--;
//         }

//          while (i >= 0) {

//             int x = a.charAt(i) - '0';

//             int sum = x + carry;

//             ans = (sum % 2) + ans;
//             carry = sum / 2;

//             i--;
//         }

//         while (j >= 0) {

//             int y = b.charAt(j) - '0';

//             int sum = y + carry;

//             ans = (sum % 2) + ans;
//             carry = sum / 2;

//             j--;
//         }

//         if (carry == 1) {
//             ans = "1" + ans;
//         }

//         return ans;
//     }
// }







class Solution {
    public String addBinary(String a, String b) {

        StringBuilder ans  = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while(i >= 0 || j >= 0 || carry != 0){

            int sum = carry;

            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }
            
            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            
            ans.append(sum % 2);
            carry = sum / 2;
        }

        return ans.reverse().toString();
    }
}