package Theme2;

class Solution1 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int middle = (left + right) / 2;
            int current = nums[middle];
            if(current == target){
                return middle;
            } else if(current < target){
                left = middle + 1;
            } else{
                right = middle - 1;
            }
        }
        return left;
    }
}
