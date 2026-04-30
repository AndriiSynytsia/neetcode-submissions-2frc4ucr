class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Create a HashSet to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet();

        // Iterate through each element in the array
        for(int num : nums) {
            //Check if the element is already in the HashSet
            if(seenNumbers.contains(num)){
                return true; // Duplicate found
            }
            // Add the element to the HashSet
            seenNumbers.add(num);
        }
        return false; // No duplicates found
    }
}