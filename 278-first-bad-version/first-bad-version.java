/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        if(n == 1) return 1;
        return firstBadVersion(1, n);
    }
    public int firstBadVersion(int l, int r){
        if(l == r) return l;
        int m = l + (r - l) / 2;
        if(isBadVersion(m)){
            if(m - 1 > 0 && !isBadVersion(m - 1)) return m;
            else return firstBadVersion(l, m);
        }else{
            return firstBadVersion(m + 1, r);
        }
    }
}