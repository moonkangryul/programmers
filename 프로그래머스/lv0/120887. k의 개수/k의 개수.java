import java.lang.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int a=i; a<=j; a++){
            String str = Integer.toString(a);
            
            for(int s=0; s<str.length(); s++){
               if(Integer.toString(k).equals(str.substring(s,s+1))){
                   answer++;
               }
            }
            
        }
        
        return answer;
    }
}