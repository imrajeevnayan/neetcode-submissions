class Solution {
    static void rev(int []nums,int start,int end){
        while(start < end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rev(nums,0,n-1);// 8,7,6,5,4,3,2,1
        rev(nums,0,k-1);// 5,6,7,8,4,3,2,1
        rev(nums,k,n-1);// 5,6,7,8,1,2,3,4
    }
}