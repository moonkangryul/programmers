import java.util.*;

class Solution {
    boolean solution(String s) {
       boolean answer = true;
        int p = 0;
        int y = 0;
        
       s = s.toLowerCase();
        
    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        
        if(ch=='p'){
            p++;
        }
        else if(ch =='y'){
            y++;
        }
    }
         
    answer = (p==y)?true:false;
        
    
    return answer;
    }
}