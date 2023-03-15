import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        return answer = numbers[numbers.length-2] * numbers[numbers.length-1];
    }
}