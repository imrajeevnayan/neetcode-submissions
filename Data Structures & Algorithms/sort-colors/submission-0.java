class Solution {
    public void sortColors(int[] nums) {
        int zerocount=0,onecount=0,twocount=0;
        for(int n:nums){
            if(n==0)zerocount++;
            else if(n==1)onecount++;
            else twocount++;
        }
        int i=0;
        while(zerocount-- >0)nums[i++]=0;
        while(onecount-- > 0)nums[i++]=1;
        while(twocount-- >0)nums[i++]=2;
        
    }
}