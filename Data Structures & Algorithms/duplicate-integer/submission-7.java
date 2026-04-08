class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenValues = new HashSet<Integer>();
        for(int num : nums) {
            if(seenValues.contains(num)) {
                return true;
            } else {
                seenValues.add(num);
            }
        }
        return false;
    }
}