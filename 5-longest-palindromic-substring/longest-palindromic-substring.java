class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0; i < s.length(); i++){
            String palindromI = palindromOf(s, i);
            longest = palindromI.length() > longest.length() ? palindromI : longest;
        }
        return longest;
    }

    // return the palidrom where i is the center
    private String palindromOf(String s, int i){
        int l = i;
        int r = i;
        String p1 = "";
        String p2 = "";

        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            r++;
            l--;
        }
        p1 = s.substring(l + 1, r);
        l = i;
        r = i + 1;
        while(r < s.length() && l >=0 && s.charAt(l) == s.charAt(r)){
            r++;
            l--;
        }
        p2 = s.substring(l + 1, r);
        return p1.length() > p2.length() ? p1 : p2;
    }
}