class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];
         
         int mul_noZero=1;
         int count=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
         }
      
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                mul_noZero*=nums[i];
            }
           
            
        }
        int i=0;
        while(i<nums.length){
            if(count==0){
                res[i]=mul_noZero/nums[i];

            }else if(count==1){
                if(nums[i]==0){
                    res[i]=mul_noZero;
                }
                }else{
                    res[i]=0;
                }
            
            
            i++;
        }
        return res;
    }
}  
