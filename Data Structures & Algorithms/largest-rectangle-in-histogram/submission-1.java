class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;

        int [] rigth = new int[n];
        int [] left = new int [n];
      Stack<Integer> st = new Stack<>();

        // rigth next smaller 
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            rigth[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st.clear();
        //left next smaller 
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<heights.length;i++){
            int currArea=heights[i]*(rigth[i]-left[i]-1);
            ans=Math.max(currArea,ans);
        }
        return ans;
    }
}
