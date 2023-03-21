import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer =0;
        Arrays.sort(numbers);
        
        int num = numbers[0] * numbers[1];
        int num1= numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if(num < num1){
            answer = num1;
        }else{
            answer = num;
        }
        return answer;
    }
}