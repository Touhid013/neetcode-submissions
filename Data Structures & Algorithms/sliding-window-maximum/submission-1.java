class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq= new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            while(dq.isEmpty()==false && dq.peekFirst()<i-k+1){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[i]>nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if(i>=k-1){
               list.add(nums[dq.peekFirst()]);
            }
        }
        int[] ans= new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
