class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] result = arr.clone();
        
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            
            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }
        
        return result;
    }
}