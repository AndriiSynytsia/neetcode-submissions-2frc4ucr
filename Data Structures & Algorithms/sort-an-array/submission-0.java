class Solution {

    public int[] sortArray(int[] nums) {
        
        // First check to make sure there is something to sort
        if(nums.length < 2) {
            return nums;
        }

        // Method call to sort and array
        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    private static void mergeSort(int[] arr, int left, int right) {
        // Base case: zero or one item sorter
        if(left >= right) {
            return;
        }

        // Finding center of array
        int middle = left + (right - left) / 2;

        // Recursive calls of the method for both halves (**will continue devide each array to the depth until array size get to '1'**)
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);

        // Combine two sorted halves (**starting from depth farest level where only one number in array**)
        merge(arr, left, middle, right);
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        // Finding the size of desired arrays
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        // Creating array accordingly to the size of finded size
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copying from main array to the secondary
        System.arraycopy(arr, left, leftArray, 0, leftSize);
        System.arraycopy(arr, middle + 1, rightArray, 0, rightSize);

        // Initialized vars for while loop
        int iLeftArray = 0;
        int iRightArray = 0;
        int iMergedArray = left;

        while(iLeftArray < leftArray.length && iRightArray < rightArray.length) {
            // Replacing from copied arrays values to the original array in sorted order
            if(leftArray[iLeftArray] <= rightArray[iRightArray]) {
                arr[iMergedArray] = leftArray[iLeftArray];
                iLeftArray++;
            } else {
                arr[iMergedArray] = rightArray[iRightArray];
                iRightArray++;
            }

            // Movi pointer to the next index
            iMergedArray++;
        }


        // Clean up block if left array will have additional values to transfer to merged array
        while(iLeftArray < leftArray.length) {
            arr[iMergedArray] = leftArray[iLeftArray];
            iLeftArray++;
            iMergedArray++;
        }

        // Clean up block if right array will have additional values to transfer to merged array
        while(iRightArray < rightArray.length) {
            arr[iMergedArray] = rightArray[iRightArray];
            iRightArray++;
            iMergedArray++;
        }
    } 
}