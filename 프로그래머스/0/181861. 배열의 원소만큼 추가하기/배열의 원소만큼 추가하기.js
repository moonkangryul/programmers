function solution(arr) {
    var answer = [];
    arr.map(x=>{
            for(var i=0; i<x; i++){
                answer.push(x);
            }
    });
    return answer;
}