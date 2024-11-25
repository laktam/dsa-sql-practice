class Solution {
    public boolean isAnagram(String s, String t) {
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();
        if(sarr.length != tarr.length) return false;
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        for(int i = 0; i < sarr.length; i++){
            if(sarr[i] != tarr[i]) return false;
        }
        return true;
    }
}