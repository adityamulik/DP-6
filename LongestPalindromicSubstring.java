
class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        
        
        // Brute Force Approach O(n^^3);
        
        int n = s.length();
        int start = 0, end = 0, max = 0;
        
        for (int i=0; i < n; i++) {
            for (int j=i; j < n; j++) {
                
                
                // checks for odd palindrome
                
                // checks for even palindrome
//                 if (s.charAt(i) == s.charAt(j)) {
                    
//                 }
                
                int p1 = i;
                int p2 = j;
                
                boolean flag = true;
                
                while (p1 <= p2) {
                    if (s.charAt(p1) != s.charAt(p2)) {
                        flag = false;
                    }
                    p1++;
                    p2--;
                }
                
                if (flag && j - i + 1 > max) {
                    max = j - i + 1;
                    start = i;
                }
            }
        }
        
        return s.substring(start, start + max);
    }
}
