class Solution {
    public int solution(int n) {
        int answer = 1;
        int cnt =1;
       
        while(answer < n){
            cnt++;
            answer *= cnt;
        }
        if(answer > n){
            cnt--;
        }
            
        return cnt;
    }
}