class Solution {
    public int solution(int chicken) {
        int ck =chicken;
        int coupon =0; 
		int count = 0;
        
        while(ck >= 10){
            coupon = ck % 10;
			count += ck / 10;
			ck = coupon + ck / 10;      
        }
        
        return count;
    }
}