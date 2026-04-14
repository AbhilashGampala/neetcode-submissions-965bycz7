class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> p=new PriorityQueue<>((a,b)->{
            int d1 = a.x * a.x + a.y * a.y;
            int d2 = b.x * b.x + b.y * b.y;
            return d1-d2;
        });
        int[][] ans=new int[k][2];
        // Collections.sort(p,);
        for(int i=0;i<points.length;i++){
            p.add(new Pair(points[i][0],points[i][1]));
        }
        for(int i=0;i<k;i++){
            Pair te=p.poll();
            ans[i][0]=te.x;
            ans[i][1]=te.y;
        }
        return ans;
    }
}
