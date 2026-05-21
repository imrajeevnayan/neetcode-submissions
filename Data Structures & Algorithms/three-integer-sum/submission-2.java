class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>>set=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer>s=new HashSet<>();
            for(int j=i+1;j<n;j++){
               int third=-nums[i]-nums[j];
               if(s.contains(third)){
                List<Integer>triplet=Arrays.asList(nums[i],nums[j],third);
                Collections.sort(triplet);
                set.add(triplet);
               }
               s.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
        
    }
}
