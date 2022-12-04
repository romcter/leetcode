package task35;

public class Task35_SearchInputPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{-1,3,5,6}, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums != null && nums.length > 0 && nums[0] != target) {
            for (int i = 0; i < nums.length; i++) {
                int currentDigit = nums[i];
                if (currentDigit == target)
                    return i;
                else if (currentDigit < target) {
                    try {
                        if (nums[i + 1] > target)
                            return i + 1;
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        return nums.length;
                    }
                }
            }
        }
        return 0;
    }
}

//    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//
//        Example 1:
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2

//        Example 2:
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1

//        Example 3:
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -104 <= nums[i] <= 104
//        nums contains distinct values sorted in ascending order.
//        -104 <= target <= 104
