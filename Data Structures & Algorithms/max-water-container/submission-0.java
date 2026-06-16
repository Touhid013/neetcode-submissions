class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max_water=0;
        while(i<j){
            int h=Math.min(heights[i],heights[j]);
           int w=j-i;
            max_water=Math.max(max_water,h*w);
            if(heights[i]<=heights[j]){
                i++;
            }else{
                j--;
            }
        }
       return max_water;
    }
}
