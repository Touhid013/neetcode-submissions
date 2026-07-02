class Solution {
    public int findMax(int l,int r,int [] nums){
        int max=Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
               max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int l=0,r=k-1;
        int max=Integer.MIN_VALUE;
        while(r<nums.length){
            max=findMax(l,r,nums);
            ans.add(max);
            l++;
            r++;
        }
        int [] list = new int [ans.size()];
        for(int i=0;i<ans.size();i++){
            list[i]=ans.get(i);
        }
        return list;
    }
}
