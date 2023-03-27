package task27;

public class Task27_RemoveElement {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{4,4,0,1,0,2}, 0));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!= val) {
                nums[count++]=nums[i];
            }
//
//            if (nums[i] == val) {
//                    System.arraycopy(nums, i + 1, nums, i, nums.length - i - 1);
//                    nums[nums.length - counter++] = 0;
//                    i--;
//            }
        }
        return count;
    }
}
