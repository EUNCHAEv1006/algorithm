class Solution {
    public int[] solution(int[] arr) {
        
        int first = -1;
        int last = -1;
        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i] == 2) {
                if(first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        
        if(first == -1) {
            return new int[] {-1};
        }
        
        int size = last - first + 1;
        int[] answer = new int[size];
        
        for(int i=0; i<size; i++) {
            answer[i] = arr[first + i];
        }
        
        return answer;
    }
}