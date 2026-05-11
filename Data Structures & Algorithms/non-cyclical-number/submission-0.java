class Solution {
    public int help(int n){
        int re=0;
        int sum=0;
        while(n>0){
            re=n%10;
            sum+=re*re;
            n=n/10;
        }
        return sum;
    }
    HashSet s=new HashSet<>();
    public boolean isHappy(int n) {
        int ans=help(n);
        if(s.contains(ans)) return false;
        if(ans==1){
            return true;
        }
        else{
            s.add(ans);
            return isHappy(ans);
        }
    }
}
