class Solution {
    public List<List<Integer>> twoSum(int[] nums,int target,int i,int j,List<List<Integer>> res){
           
        while(i<j){
        if(nums[i]+nums[j]>target){
            j--;
        }else if(nums[i]+nums[j]<target){
            i++;
        }else{
            List<Integer> list= new ArrayList<>();
            while(i<j &&nums[i]==nums[i+1]){
                i++;
            }
            while(i<j && nums[j]==nums[j-1]){
                j--;
            }
            list.add(-target);
            list.add(nums[i]);
            list.add(nums[j]);

            res.add(list);
            
            i++;
            j--;
            
        }
        
        }
        return res;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        if(n<3){
            return new ArrayList<>();
        }
        for(int i=0;i<n;i++){
           
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int n1=nums[i];
            int target=-n1;

            twoSum(nums,target,i+1,n-1,res);






        }
        return res;
    }
}
