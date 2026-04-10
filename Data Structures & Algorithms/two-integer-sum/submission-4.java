class Solution {
    public int[] twoSum(int[] nums, int target) {        
        Map<Integer, Integer> numsCopy = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            numsCopy.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(numsCopy.containsKey(diff) && numsCopy.get(diff) != i) {
                return new int[]{i, numsCopy.get(diff)};
            }
        }
        return new int[]{-1, -1};
    }
}
