class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> q = new PriorityQueue<int[]>((ar1, ar2)->{
            // calculate distances to 0, 0
            double dist1 = Math.sqrt(ar1[0] * ar1[0] + ar1[1] * ar1[1]);
            double dist2 = Math.sqrt(ar2[0] * ar2[0] + ar2[1] * ar2[1]);
            if(dist1 > dist2) return 1;
            if(dist1 < dist2) return -1;
            else return 0;
        });
        for(int i = 0; i < points.length; i++){
            q.add(points[i]);
        }
        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++){
            int[] e = q.remove();
            result[i] = new int[] {e[0], e[1]};
        }
        return result;

    }
}