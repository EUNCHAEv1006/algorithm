class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] toDelete = new boolean[my_string.length()];
        
        for(int idx:indices) {
            toDelete[idx] = true;
        }
        
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            if(!toDelete[i]) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}