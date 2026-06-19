class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>res=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third))res.add(Arrays.asList(nums[i],nums[j],third));
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}
