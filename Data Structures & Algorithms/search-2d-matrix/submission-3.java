class Solution {
  public boolean searchInRow(int[][] mat, int tar,int row){
    int n=mat[0].length;

    int st=0;
    int end=n-1;
    while(st<=end){
      int mid=st+(end-st)/2;
      if(tar==mat[row][mid]){
        return true;
      }else if(tar>=mat[row][mid]){
        st=mid+1;
      }else{
        end=mid-1;
      }

    }
    return false;
  }
    public boolean searchMatrix(int[][] mat, int tar) {
        int m=mat.length;
        int n= mat[0].length;
        int stRow=0;
        int endRow=m-1;

        while(stRow<=endRow){
          int mid=stRow+(endRow-stRow)/2;

          if(tar>=mat[mid][0] && tar<=mat[mid][n-1]){
            return searchInRow(mat,tar,mid);
          }else if(tar>=mat[mid][n-1]){
            stRow=mid+1;
          }else{
            endRow=mid-1;
          }
        }
        return false;
    }
}
