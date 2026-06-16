class Solution {
    public List<List<String>> groupAnagrams(String[] strs){

         HashMap<String ,List<String>> map= new HashMap<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
           if(!map.containsKey(sortedKey)){
            map.put(sortedKey,new ArrayList<>());
           }
           map.get(sortedKey).add(str);
            
        }
        List<List<String>> ans= new ArrayList(map.values());
        return ans;
}
}
