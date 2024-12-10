class Solution {
    public int maximumLength(String s) {
        // map string , frequency
        // for substring "aaaa" => frequency for every combinaition
        // aa__, _aa_, __aa
        Map<String, Integer> map = new HashMap<>();
        int start = 0;
        int length = s.length();
        for(int end = 0; end < length; end++){
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if(startChar != endChar){
                String special = s.substring(start, end);
                calculateCombinationsFrequency(map, special);
                start = end;
            } 
        }

        // last special
        calculateCombinationsFrequency(map, s.substring(start, s.length()));
        
        Queue<String> queue = new PriorityQueue<>((s1, s2)->{
            return map.get(s2) - map.get(s1);
        });

        map.entrySet().forEach((e)->{
            System.out.println("special : " + e.getKey());
            System.out.println("freq : " + e.getValue());
            queue.add(e.getKey());
        });

        int size = queue.size();
        int longest = 0;
        for(int i = 0; i < size; i++){
            String special = queue.remove();
            if(map.get(special) >= 3){
                longest = Math.max(longest, special.length());
            }else{
                break;
            }
        }
        return longest == 0 ? -1 : longest;

    }
    private void calculateCombinationsFrequency(Map<String, Integer> map, String s){
        for(int size = 1; size <= s.length(); size++){
            for(int start = 0; start <= s.length() - size; start++){
                String special = s.substring(start, start + size);
                map.put(special, map.getOrDefault(special, 0) + 1);
            }
        }
    }
}