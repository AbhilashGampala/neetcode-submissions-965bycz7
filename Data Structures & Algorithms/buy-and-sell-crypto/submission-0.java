class Solution {
    public int maxProfit(int[] prices) {
        int[] nmax=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int max=0;
            // int nge=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]&&max<prices[j]){
                    max=prices[j];
                }
            }
            nmax[i]=max;
        }
        int ma=0;
        int diff=0;
        // for(int i=0;i<prices.length;i++){
        //     System.out.print(nmax[i]+" ");
        // }
        for(int i=0;i<prices.length;i++){
            if(nmax[i]==0) continue;
            diff=nmax[i]-prices[i];
            if(diff>ma) ma=diff;
        }
        return ma;
    }
}
