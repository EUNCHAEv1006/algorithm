class Solution {
    public String solution(String code) {
        String answer = "";
        
        String[] codeArray = code.split("");
        int mode = 0;
        
        for(int j=0; j<codeArray.length; j++) {
            if(mode==0) {
                if(codeArray[j].equals("1")) {
                    mode = 1;
                } else {
                    if(j%2==0) {
                        answer += codeArray[j];
                    }
                }
            } else {
                if(codeArray[j].equals("1")) {
                    mode = 0;
                } else {
                    if(j%2!=0) {
                        answer += codeArray[j];
                    }
                }
            }
        }
        
        if(answer.equals("")) {
            return "EMPTY";
        }
        
        return answer;
    }
}