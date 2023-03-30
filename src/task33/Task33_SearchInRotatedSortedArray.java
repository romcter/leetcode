package task33;

public class Task33_SearchInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(search(new int[]{2,3,4,5,6,0,1}, 2));
    }

    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end){
            int midIndex = (start + end) / 2;
            if(nums[midIndex] == target) return midIndex;
            if(nums[start] <= nums[midIndex]){
                if(nums[midIndex] >= target && nums[start] <= target)
                    end = midIndex - 1;
                else
                    start = midIndex + 1;
            }  else {
                if(nums[midIndex] <= target && nums[end] >= target)
                    start = midIndex + 1;
                else
                    end = midIndex - 1;

            }
        }
        return -1;
    }
}
