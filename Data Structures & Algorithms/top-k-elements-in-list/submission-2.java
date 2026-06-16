class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       List<Integer> list= new ArrayList<>();


      while(k!=0){
      int max=Integer.MIN_VALUE;
     int maxKey=0;
      for(int i:map.keySet()){
        if(map.get(i)>max){
        max=map.get(i);
        maxKey=i;
        }
      }
      list.add(maxKey);
      map.remove(maxKey);
      k--;
      }

      int [] ans = new int[list.size()];
      for(int i=0;i<list.size();i++){
        ans[i]=list.get(i);
      }

      return ans;
      
    }
}
