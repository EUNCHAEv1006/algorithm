class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int add = 0;
        
        for(int j=0; j<num_list.length; j++) {
            add += num_list[j];
        }
        
        for(int i=0; i<num_list.length; i++){
            answer *= num_list[i];
        }
        
        if(answer<Math.pow(add, 2)) {
            return 1;
        } else {
            return 0;
        }
    }
}