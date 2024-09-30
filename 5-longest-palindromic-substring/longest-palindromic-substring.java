class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        String palindrom = "";
        for(int c = 0; c < s.length(); c++){
            String p = palindrome(s, c);
            if(p.length() > palindrom.length()){
                palindrom = p;
            }
            if((c + 1) < s.length()){
                p = evenPalindrome(s, c);
                if(p.length() > palindrom.length()){
                    palindrom = p;
                }
            }
        }
        return palindrom;
    }
    public String palindrome(String s, int c){
        String p = s.substring(c, c + 1);

        for(int toStart = c - 1, toEnd = c + 1; 
        toEnd < s.length() && toStart >= 0; toStart--, toEnd++){
            char a = s.charAt(toStart); 
            char z = s.charAt(toEnd);
            if(a != z){
                break;
            }else{
                p = s.substring(toStart, toEnd + 1);
            }
            
        }
        return p;
    }
    public String evenPalindrome(String s, int c){
        String p = s.substring(c, c + 1);

        for(int toStart = c, toEnd = c + 1; 
        toEnd < s.length() && toStart >= 0; toStart--, toEnd++){
            char a = s.charAt(toStart); 
            char z = s.charAt(toEnd);
            if(a != z){
                break;
            }else{
                p = s.substring(toStart, toEnd + 1);
            }
            
        }
        return p;
    }

}