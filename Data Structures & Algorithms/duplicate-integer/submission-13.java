class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Traverse throught array
        //Add each element to HashMap<Integer, Integer>
        //If !map.containsKey(n) -> map.put(n, 1);
        // else -> map.put(n, map.getOrDefault(n + 1, 1));
        boolean isDuplicate = false;
        Set<Integer> noDup = new HashSet();
        for (int n : nums) {
            noDup.add(n);
        }
        if (nums.length != noDup.size()) {
            isDuplicate = true;
        }

        return isDuplicate;
    }
}