function solution(s, e) {
    var answer = [];
    for(var i=s; i>=e; i--){
        answer.push(i);
    }
    return answer;
}