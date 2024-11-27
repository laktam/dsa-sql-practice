/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(!isBadVersion(n - 1)) return n;
        int l = 1;
        int r = n;
        int m = l + (r - l) / 2;
        while(l <= r){
            m = l + (r - l) / 2;
            if(isBadVersion(m)){
                if(m - 1 > 0 && !isBadVersion(m - 1)) return m;
                else r = m - 1;
            }else{
                l = m + 1;
            }
        }
        return m;
    }
}