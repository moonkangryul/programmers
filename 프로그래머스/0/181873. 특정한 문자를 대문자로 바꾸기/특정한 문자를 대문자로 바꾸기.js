function solution(str, alp) {
    return str.split('').map((x)=>(x==alp) ? x.toUpperCase() : x).join('');
}