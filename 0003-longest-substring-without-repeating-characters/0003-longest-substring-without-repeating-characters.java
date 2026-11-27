class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int length = 0;
        int j = 0;

        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            
            length = Math.max(length, i - j + 1);
            
            set.add(ch);
        }
        return length;
    }
}