class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] buffer = new int[26];

        for(int i = 0; i < s.length(); i++) {
            buffer[s.charAt(i) - 'a']++;
            buffer[t.charAt(i) - 'a']--;
        }

        for(int n : buffer) {
            if(n != 0) {
                return false;
            }
        }

        return true;
    }
}
