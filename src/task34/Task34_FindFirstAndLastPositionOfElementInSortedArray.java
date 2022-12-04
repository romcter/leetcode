package task34;

import java.util.Arrays;

public class Task34_FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 1)));
    }

    public static int[] searchRange(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int digitBegin = nums[i];
            if (digitBegin == target) {
                for (int j = i; j < nums.length; j++) {
                    int digitEnd = nums[j];
                    try {
                        if (digitEnd == target && nums[j + 1] != target) {
                            return new int[]{i, j};
                        }
                    } catch (ArrayIndexOutOfBoundsException exception) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }
}

//    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//        If target is not found in the array, return [-1, -1].
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//
//        Example 1:
//        Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]
//
//        Example 2:
//        Input: nums = [5,7,7,8,8,10], target = 6
//        Output: [-1,-1]
//
//        Example 3:
//        Input: nums = [], target = 0
//        Output: [-1,-1]
