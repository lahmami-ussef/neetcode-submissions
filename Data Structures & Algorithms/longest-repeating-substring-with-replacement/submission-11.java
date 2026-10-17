

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int maxFreq = 0;
        int maxLen = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            char rightChar = s.charAt(j);

            map.put(rightChar,
                map.getOrDefault(rightChar, 0) + 1);

            maxFreq = Collections.max(map.values());

            while ((j - i + 1) - maxFreq > k) {
                char leftChar = s.charAt(i);

                map.put(leftChar, map.get(leftChar) - 1);
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}
