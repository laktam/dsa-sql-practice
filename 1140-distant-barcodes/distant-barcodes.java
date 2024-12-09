class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < barcodes.length; i++){
            map.put(barcodes[i], map.getOrDefault(barcodes[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((e1, e2)->{
            return e2.getValue() - e1.getValue();
        });
        
        boolean filled[] = new boolean[barcodes.length];
        Arrays.fill(filled, false);

        int result[] = new int[barcodes.length];

        int i = 0;
        for(Map.Entry<Integer, Integer> entry : entryList){
            int barcode = entry.getKey();
            int freq = entry.getValue();
            
            while(freq > 0){
                if(i >= barcodes.length){
                    i = 1;
                }
                result[i] = barcode;
                freq--;
                i = i + 2;
            }
        }

        return result;
        
    }
}