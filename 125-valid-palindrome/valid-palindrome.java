class Solution {
    public boolean isPalindrome(String s) {

        s = clean(s);
        if(s.length() == 0){
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while(s.charAt(start) == s.charAt(end)){
            if(start == end){
                return true;
            }else if(start == end - 1){
                return true;
            }else if(start != end){
                start++;
                end--;
            }
            
        }
        return false;
    }

    private String clean(String s){
        String r = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))){
                r = r + Character.toLowerCase(s.charAt(i));
            }
        }
        return r;
    }
}