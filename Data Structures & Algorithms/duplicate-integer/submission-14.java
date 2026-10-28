class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> noDup = new HashSet();
        for (int n : nums) {
            if (noDup.contains(n)) {
            return true;
        }
            noDup.add(n);
        }
        return false;
    }
}