class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map= new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
  boolean ans=true;
  for(char ch:map.keySet() ){
    if(!map2.containsKey(ch) || !map.get(ch).equals(map2.get(ch))){
        ans=false;
    }
  }
        
     return ans;
    }
}
