class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if(num_list.length>=11) {
            for(int i=0; i<num_list.length; i++){
                answer += num_list[i];
            }
        } else if(num_list.length<=10) {
            int answer10 = 1;
            for(int i=0; i<num_list.length; i++){
                answer10 *= num_list[i];
            }
            return answer10;
        }
        
        return answer;
    }
}