class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int max=0;
        int left=0;
        int right=0;


        while(right<s.length())
        {
            if(!seen.contains(s.charAt(right)))
            {
                seen.add(s.charAt(right));
                max=Math.max(max,seen.size());
                right++;
            }
            else
            {
                seen.remove(s.charAt(left));//shrink
                left++;
            }
        }
        return max;
        
        
        
    }
}
