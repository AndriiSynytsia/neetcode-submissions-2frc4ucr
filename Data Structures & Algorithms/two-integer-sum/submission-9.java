class Solution {
    public int[] twoSum(int[] nums, int target) {        
         Map<Integer, Integer> buffer = new HashMap();

         for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(buffer.containsKey(diff) && buffer.get(diff) != i) {
                return new int[]{buffer.get(diff), i};
            }
            buffer.put(nums[i], i);
         }
         return new int[0];
    }
}
