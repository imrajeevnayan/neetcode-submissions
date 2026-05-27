class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int i=0,j=n-1,index=n-1;
        while(i <=j){
            int ls=nums[i]*nums[i];
            int rs=nums[j]*nums[j];
            if(ls > rs){
                res[index]=ls;
                i++;
            }
            else{
                res[index]=rs;
                j--;
            }
           index--;
        }
        return res;
    }
}