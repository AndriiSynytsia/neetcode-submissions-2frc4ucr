class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsCopy = new HashSet<>();

        for(int n : nums) {
            if(numsCopy.contains(n)) {
                return true;
            } else {
                numsCopy.add(n);
            }
        }
        return false;
    }
}