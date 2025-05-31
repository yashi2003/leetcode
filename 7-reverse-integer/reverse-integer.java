//the main logic is you have to divide it by 10 then multiply the last digit with 10
// while cutting the number down
class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);  // taking the absolute of the original number
        
        int rev = 0;  // Reversed number
        
        while (num != 0) {
            int ld = num % 10;  // Last digit nikala
            
            // Overflow check
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0;  // Agar overflow hua, toh 0 return kardo
            }
            
            rev = rev * 10 + ld;  
            num = num / 10;  // Last digit hata diya, next iteration ke liye
        }
        
        return (x < 0) ? (-rev) : rev;
    }
}