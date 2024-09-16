class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(t.contains(Character.toString(s.charAt(i)))){
                t = t.replaceFirst(Character.toString(s.charAt(i)), "");
            }else{
                return false;
            }
        }
        if(t.length() == 0){
            return true;
        }
        
        return true;
    }
}