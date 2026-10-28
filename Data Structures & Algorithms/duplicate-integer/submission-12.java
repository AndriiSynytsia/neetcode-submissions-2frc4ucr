class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Traverse throught array
        //Add each element to HashMap<Integer, Integer>
        //If !map.containsKey(n) -> map.put(n, 1);
            // else -> map.put(n, map.getOrDefault(n + 1, 1));

        boolean isDuplicate = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                isDuplicate = true;
            } 
        }
        return isDuplicate;
    }
}