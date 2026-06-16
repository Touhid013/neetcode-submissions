class Solution {
    public int trap(int[] height) {
      int [] left_max= new int[height.length];

      int [] right_max= new int[height.length];
        
        //for left max;
      left_max[0]=height[0];
      right_max[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++ ){
            left_max[i]=Math.max(left_max[i-1],height[i]);
        }

        //for rigth;

        for(int i=height.length-2;i>=0;i-- ){
            right_max[i]=Math.max(right_max[i+1],height[i]);
        }


        
      
     int trap=0;
      for(int i=0;i<height.length;i++){
       int curr=height[i];
       int a=0;
       a+=Math.min(left_max[i],right_max[i])-curr;
       trap+=a;
      }
      return trap;
    }
}
