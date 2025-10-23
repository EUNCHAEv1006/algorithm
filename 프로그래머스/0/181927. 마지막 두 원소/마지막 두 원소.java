class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int minus = num_list[num_list.length-1] - num_list[num_list.length-2];
        int multi = 2*num_list[num_list.length-1];
        
        if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
            answer[num_list.length] = minus;
        } else {
            answer[num_list.length] = multi;
        }
        
        for(int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}