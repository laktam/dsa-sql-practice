class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int result = 0;
        for(int c = 0; c < s.length(); c++){
            if(c + 1 < s.length() && m.get(s.charAt(c)) < m.get(s.charAt(c + 1))){
                result = result - m.get(s.charAt(c));
            }else{
                result += m.get(s.charAt(c));
            }
        }
        return result;
    }
}