class Solution {
    public int search(int[] nums, int target) {
        int r=nums.length-1;
        int l=0;

        while(r>=l){
            int mid=(r-l)+l/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                l++;
            }else{
                r--;
            }
        }
        return -1;
    }
}
