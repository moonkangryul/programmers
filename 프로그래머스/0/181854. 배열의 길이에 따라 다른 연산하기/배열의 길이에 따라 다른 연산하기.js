function solution(arr, n) {
    var answer = [];
    (arr.length%2==0) ?     
    arr.map((x,idx)=>{
        if(idx%2!=0){
            answer.push(x+n);
        }else{
            answer.push(x);
        }
    }) : 
    arr.map((x,idx)=>{
        if(idx%2==0){
            answer.push(x+n);
        }else{
            answer.push(x);
        };
    });
    return answer;
}