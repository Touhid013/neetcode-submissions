class Solution {
  public boolean canEatAll(int []piles,int mid, int h){

    int actualHours=0;
    for(int i:piles){
      actualHours+=i/mid;
      if(i%mid!=0){
        actualHours++;
      }

    }
    return actualHours<=h;
  }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        
        Arrays.sort(piles);
         int r=piles[piles.length-1];


         while(l<r){
          int mid=l+(r-l)/2;

          if(canEatAll(piles,mid,h)){
            r=mid;
          }else{
            l=mid+1;
          }
         }
         return l;
    }
}
