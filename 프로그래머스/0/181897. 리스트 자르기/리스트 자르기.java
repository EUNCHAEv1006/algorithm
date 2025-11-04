import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] ranswer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        if(n==1) {
            int[] answer = new int[slicer[1]+1];
            for(int i=0; i<=slicer[1]; i++) {
                arrayList.add(num_list[i]);
            }
            
            for(int j=0; j<answer.length; j++) {
                answer[j] = arrayList.get(j);
            }
            
            return answer;
        }
        
        if(n==2) {
            int[] answer = new int[num_list.length-slicer[0]];
            for(int i=slicer[0]; i<num_list.length; i++) {
                arrayList.add(num_list[i]);
            }
            
            for(int j=0; j<answer.length; j++) {
                answer[j] = arrayList.get(j);
            }
            
            return answer;
        }
        
        if(n==3) {
            int[] answer = new int[slicer[1] - slicer[0] + 1];
            for(int i=slicer[0]; i<=slicer[1]; i++) {
                arrayList.add(num_list[i]);
            }
            
            for(int j=0; j<answer.length; j++) {
                answer[j] = arrayList.get(j);
            }
            
            return answer;
        }
        
        if(n==4) {
            int[] answer = new int[((slicer[1] - slicer[0])/slicer[2])+1];
            for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                arrayList.add(num_list[i]);
            }
            
            for(int j=0; j<answer.length; j++) {
                answer[j] = arrayList.get(j);
            }
            
            return answer;
        }
        
        return ranswer;
    }
}