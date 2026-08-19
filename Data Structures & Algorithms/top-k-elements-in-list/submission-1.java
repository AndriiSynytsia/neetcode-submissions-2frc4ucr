class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Check the length of array to value 'k'
        if(k == nums.length) {
            return nums;
        }

        // Create map for storing the numbers and count their occurance in the list
        Map<Integer, Integer> count = new HashMap<>();
        // Iteration through the list and updating map with new values
        for(int n : nums) {
            // 'getOrDefault(k, default)' where k is the map key. If the value is not specified
            // the default parameter will return '0' 
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // The queue with ordering using comparison where value with bigger occurance will take place in 
        // the queue and the smallest appearance will be up top
        Queue<Integer> heap = new PriorityQueue<>(
            // Could be used `Comparator.comparingInt(count::get)`
            (a,b) -> count.get(a) - count.get(b)
        );

        // Iteration through set of 'count' keys where we using queue with rule to verify appearance in it 
        // and add the number to the heap or provide deletion of least number from the heap if size of it 
        // is more than 'k' value
        for(int n : count.keySet()) {
            heap.add(n);
            if(heap.size() > k) {
                heap.poll();
            }
        }

        // Writing the result to the new array 
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }
}
