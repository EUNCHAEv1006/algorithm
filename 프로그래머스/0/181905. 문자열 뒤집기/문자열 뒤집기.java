class Solution {
    public String solution(String my_string, int s, int e) {
        
        String front = my_string.substring(0, s);
        String middle = my_string.substring(s, e+1);
        String back = my_string.substring(e+1);
        
        StringBuilder my_stringSB = new StringBuilder(middle);
        my_stringSB.reverse();
        
        return front + my_stringSB.toString() + back;
    }
}