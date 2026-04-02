class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> mst=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(mst.isEmpty()) mst.push(val);
        else{
            mst.push(Math.min(mst.peek(),val));
        }
    }
    
    public void pop() {
        st.pop();
        mst.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mst.peek();
    }
}
