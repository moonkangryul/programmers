import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int a=0; a<n; a++){
            for(int s=0; s<=a; s++){
                System.out.print("*");
            }
            System.out.println("");
        }

        
    }
}