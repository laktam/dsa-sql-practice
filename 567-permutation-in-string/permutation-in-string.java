class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int l = 0;
        int s1l = s1.length();
        int s2l = s2.length();
        char s1arr[] = s1.toCharArray();
        Arrays.sort(s1arr);

        for(int r = s1l - 1; r < s2l; r++){
            char s2arr[] = s2.substring(l, r + 1).toCharArray();
            Arrays.sort(s2arr);
            
            for(int i = 0; i < s1l; i++){
                if(s2arr[i] != s1arr[i]) break;
                if(i == s1l - 1) return true;
            }
            l++;
        }
        return false;
    }
}