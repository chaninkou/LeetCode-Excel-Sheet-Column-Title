package leetcode168;

public class ConvertNumberToTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        
        // Since 1 = A
        // 26 = Z
        // 27 = AA
        while (n > 0) {
            n--;
            
            sb.append((char)(n % 26 + 'A'));
            
            n = n/26;
        }
        
        
        return sb.reverse().toString();
    }
}
