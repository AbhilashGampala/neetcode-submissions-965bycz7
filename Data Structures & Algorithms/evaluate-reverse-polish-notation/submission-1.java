class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];
            if(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/")){
                int a=st.pop();
                int b=st.pop();
                switch(ch){
                    case "+": st.push(a+b);
                                break;
                    case "-": st.push(b-a);
                                break;
                    case "*": st.push(a*b);
                                break;
                    case "/": st.push(b/a);
                                break;
                }
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.peek();
    }
}
