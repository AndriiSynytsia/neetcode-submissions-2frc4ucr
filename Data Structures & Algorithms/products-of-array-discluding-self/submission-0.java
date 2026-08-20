class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Create result array to save the answer
        int[] result = new int[nums.length];
        // Prefix and postfix inintialization
        int prefix = 1;
        int postfix = 1;
        
        // Fill the array with default values
        Arrays.fill(result, 1);

        // Itterate through the array and put a new value in it and update prefix value
        // for the following number
        for(int i = 0; i < nums.length; i++) {
            // Update current value with prefix
            result[i] = prefix;
            // Update prefix with new value
            prefix = nums[i] * prefix;
        }

        // Reversed traversion for final calculation of result
        // Current number updated using postfix
        // Updates postfix for the following number
        for(int i = nums.length - 1 ; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix = nums[i] * postfix;
        }

        return result;
    }
}  
