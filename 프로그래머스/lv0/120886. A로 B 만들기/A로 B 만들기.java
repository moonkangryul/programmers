import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
        char[] A = before.toCharArray();
        char[] B = after.toCharArray();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        String str = new String(A);
        String str1 = new String(B);
        

        return str.equals(str1) ? 1:0;
    }
}