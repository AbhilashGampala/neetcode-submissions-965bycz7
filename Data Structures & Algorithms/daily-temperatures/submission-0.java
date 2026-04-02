class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int[] nge=new int[n];
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&temp[st.peek()]<=temp[i]) st.pop();
            if(st.isEmpty()) nge[i]=-1;
            else nge[i]=st.peek();
            st.push(i);
        }
        for(int i=0;i<n;i++){
            if(nge[i]==-1)ans[i]=0;
            else ans[i]=nge[i]-i;
        }
        return ans;
    }
}
