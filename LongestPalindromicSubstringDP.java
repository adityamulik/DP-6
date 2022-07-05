

class LongestPalindromicSubstringDP {
    public String longestPalindrome(String s) {
	/*
         * DP Method: O(n^^2) TC & SC
 	 */
	
        if (s.length() == 0 || s == null) return "";                
        
        int n = s.length();
        int start = 0, end = 0, max = 0;
        
        // dp approach
        boolean[][] dp = new boolean[n][n];
        
        for (int i=0; i < n; i++) {
            for (int j=0; j <= i; j++) {
                
                if (s.charAt(i) == s.charAt(j) && (i - j - 1 <= 1 || dp[i-1][j+1])) {
                    dp[i][j] = true;
                    
                    if (max < i - j + 1) {
                        max = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }
        
        return s.substring(start, start + max);
    }
}
