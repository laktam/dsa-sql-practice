class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // int start = 0;
        int s1Length = s1.length();
        int s2Length = s2.length();
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        for(int end = s1Length - 1; end < s2Length; end++){
            int start = end - s1Length + 1;
            char arr2[] = s2.substring(start, end + 1).toCharArray();
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2)) return true;
        }
        return false;
    }
}