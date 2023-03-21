class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt =0;
       do{
            cnt += n;
            answer = cnt / 6;
        }while(cnt % 6 != 0);
        
        return answer;
    }
}