class Solution {
    public int solution(String myString, String pat) {
        
        String lowerMy = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();
        
        if (lowerMy.contains(lowerPat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
