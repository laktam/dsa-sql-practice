class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<Integer[]> q = new PriorityQueue<Integer[]>((ar1, ar2)->{
            // calculate distances to 0, 0
            double dist1 = Math.sqrt(Math.pow(ar1[0], 2) + Math.pow(ar1[1], 2));
            double dist2 = Math.sqrt(Math.pow(ar2[0], 2) + Math.pow(ar2[1], 2));
            if(dist1 > dist2) return 1;
            if(dist1 < dist2) return -1;
            else return 0;
        });
        for(int i = 0; i < points.length; i++){
            Integer[] p = new Integer[]{points[i][0], points[i][1]};
            q.add(p);
        }
        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++){
            Integer[] e = q.remove();
            result[i] = new int[] {e[0].intValue(), e[1].intValue()};
        }
        return result;

    }
}