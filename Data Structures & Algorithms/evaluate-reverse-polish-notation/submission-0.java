class Solution {
    public int Operate(int a , int b ,String ch){
        if(ch.equals("+")){
            return b+a;

        }
        if(ch.equals("-")){
            return b-a;
            
        }
        if(ch.equals("*")){
            return b*a;
            
        }
        if(ch.equals("/")){
            return b/a;
            
        }
        return 0;
    }

    public int evalRPN(String[] token) {
        Stack<Integer> st = new Stack<>();
        int res=0;
        for(String  ch :token){
            if(!ch.equals("+")&& !ch.equals("-")&& !ch.equals("*")&& !ch.equals("/")){
                st.push(Integer.parseInt(ch));
            }else{
                int a=st.peek();
                st.pop();
                int b=st.peek();
                st.pop();
                int result=Operate(a,b,ch);
                st.push(result);
            }
        }
        return st.peek();
    }
}
