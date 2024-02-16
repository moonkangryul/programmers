function solution(num, n) {
    var answer = 0;
    var i=0;
    
    while(answer <= n){
        answer+=num[i]
        i++;
    }
    
    return answer;
}