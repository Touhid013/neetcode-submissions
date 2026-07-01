class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
          return "";
        }

        int l=0,r=0;
        int minWindow=Integer.MAX_VALUE;
        HashMap<Character,Integer> map= new HashMap<>();
        int start_i=0;
        for(char ch: t.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int countReq=t.length();


        while(r<s.length()){
          char ch=s.charAt(r);
          if(map.containsKey(s.charAt(r))){
             if(map.get(ch)>0){
            countReq--;
            

          }
          map.put(ch,map.get(ch)-1);
          }
          
          while(countReq==0)//shrinking
           {
           int curWindow=r-l+1;
           if(minWindow>curWindow){
            minWindow=curWindow;
              start_i=l;
           }
           char left=s.charAt(l);
           if(map.containsKey(left)){
                map.put(left,map.get(left)+1);
           if(map.get(left)>0){
            countReq++;

           }
           
           }
           l++;

          }
          r++;
        }
        if(minWindow==Integer.MAX_VALUE){
          return "";
        }
        return s.substring(start_i,start_i+minWindow);
        
    }
}

