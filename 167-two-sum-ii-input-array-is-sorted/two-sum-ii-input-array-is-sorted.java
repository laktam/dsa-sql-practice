class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++){
            int end = numbers.length - 1;
            while(i < end){
                if(numbers[i] + numbers[end] == target) return new int[]{ i + 1 , end + 1};
                end--;
            }
        }
        return new int[] {0, 0};
    }
}