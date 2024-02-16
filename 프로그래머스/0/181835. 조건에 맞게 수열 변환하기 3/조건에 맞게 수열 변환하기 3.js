function solution(arr, k) {
    var answer = [];
    for(const num of arr){
       (k%2!==0) ? answer.push(num*k) : answer.push(num+k);
    }
    return answer;
}