class Solution {
    public int[] twoSum(int[] nums, int target) {        
        int[][] numsCopy = new int[nums.length][2];
        
        for(int i = 0; i < nums.length; i++) {
            numsCopy[i][0] = nums[i];
            numsCopy[i][1] = i;
        }

        Arrays.sort(numsCopy, Comparator.comparingInt(a -> a[0]));

        int i = 0;
        int j = nums.length - 1;

        while(i < j) {
            int current = numsCopy[i][0] + numsCopy[j][0];
            if(current == target) {
                return new int[]{
                                Math.min(numsCopy[i][1], numsCopy[j][1]),
                                Math.max(numsCopy[i][1], numsCopy[j][1])
                                };
            } else if(current < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}
