class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s1word : s1){
            for(String s2word : s2){
                if( s1word.equals(s2word) )
                {
                    answer++;
                }
            }
        }
        return answer;
    }
}