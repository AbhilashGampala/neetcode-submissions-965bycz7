class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>((x,y)->{
            if(x>=y) return -1;
            else return 1;
        });
        for(int i=0;i<stones.length;i++){
            q.add(stones[i]);
        }
        while(q.size()>=2){
            int x=q.poll();
            int y=q.poll();
            q.add(x-y);
        }
        return q.poll();
    }
}
