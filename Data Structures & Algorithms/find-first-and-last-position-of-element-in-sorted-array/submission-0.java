class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstOcc(nums, target);
        ans[1] = lastOcc(nums, target);
        return ans;
    }
    int firstOcc(int[] nums, int target) {
        int low = 0, high = nums.length - 1,ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target)low = mid + 1;
            else  high = mid - 1;
        }
        return ans;
    }
      int lastOcc(int[] nums, int target) {
        int low = 0, high = nums.length - 1,ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                ans = mid;
                low = mid+ 1;
            }
            else if(nums[mid] < target)low = mid + 1;
            else  high = mid - 1;
        }
        return ans;
    }
}