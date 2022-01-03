package Recursion2.DivideAndConquer;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;
        int pivot = nums.length / 2;
        int[] leftArray = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int[] rightArray = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));
        return merge(leftArray, rightArray);
    }
    
    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        while (leftIndex < left.length  && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }
        
        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }
         while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }
        return result;
    }
    
}
