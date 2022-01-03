package Problems.Easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int controlNumber = target - number;
            int index = indexOf(nums, controlNumber);
            if(index > -1 && index != i) {
                result[0] = i;
                result[1] = index;
                break;
            }
        }
        return result;
    }
    
    private int indexOf(int[] arr, int el) {
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == el) {
                return i;
            }
        }
        return -1;
    }
}


