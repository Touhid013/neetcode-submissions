class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashSet<String> set= new HashSet<>();
        int n=s1.length();

        for(int i=0;i<s2.length();i++){
            if(i+n<=s2.length()){
                String temp=(s2.substring(i,i+n));
            
             
            char [] ch=temp.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);

            set.add(s);
            }
        }

      char [] sort= s1.toCharArray();
      Arrays.sort(sort);
      String sorted = new String(sort);

      if(!set.contains(sorted)){
        return false;
      }
      return true;
    } 
}
