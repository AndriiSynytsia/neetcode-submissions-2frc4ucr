class Solution {
    public boolean isPalindrome(String s) {
        char[] pal = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        char[] reverse = new char[pal.length];
        
        int lastIndex = pal.length - 1;
        for(int i = 0; i < pal.length; i++) {
            reverse[i] = pal[lastIndex - i];
        }
        return Arrays.equals(pal, reverse);
    }
}
