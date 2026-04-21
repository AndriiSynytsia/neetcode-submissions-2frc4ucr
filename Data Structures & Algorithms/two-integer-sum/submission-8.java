class Solution {
    public int[] twoSum(int[] nums, int target) {        
        Map<Integer, Integer> table = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(table.containsKey(diff) && table.get(diff) != i) {
                return new int[]{table.get(diff), i};
            }
            table.put(nums[i], i);
        }
        return new int[0];
    }
}
