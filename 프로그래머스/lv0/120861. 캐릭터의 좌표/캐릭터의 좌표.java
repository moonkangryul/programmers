import java.lang.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int val = 0;
        
    for(String x:keyinput){
            val =  "left".equals(x) ? 1 : "right".equals(x) ? 2 : "up".equals(x) ? 3 : 4;  
        
        switch(val){
            case 1: answer[0] -= answer[0] > -Math.floor((board[0]/2)) ? 1 : 0; 
                break;
            case 2: answer[0] += answer[0] < Math.floor((board[0]/2)) ? 1 : 0; 
                break;
            case 3: answer[1] += answer[1] < Math.floor((board[1]/2)) ? 1 : 0; 
                break;
            case 4: answer[1] -= answer[1] > -(board[1]/2) ? 1 : 0; 
                    System.out.print(answer[1]);
                break;
        }
    }
        return answer;
    }
}