class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
           int lastSmall=Integer.MIN_VALUE;
           int longest=1;
           int cnt=0;
           for(int i=0;i<nums.length;i++){
            
            if(nums[i]-1==lastSmall){
                cnt+=1;
                lastSmall=nums[i];
            }
            
            else if(nums[i]!=lastSmall && nums[i]-1!=lastSmall){
                cnt=1;
                lastSmall=nums[i];
            }
            longest=Math.max(cnt,longest);
           }
           return longest;
    }
}
