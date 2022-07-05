
class LongestPalindromicSubstringOptimised {
    
    int start = 0, end = 0, max = 0;
    
    public String longestPalindrome(String s) {
        
        /*
         * Time Complexity: O(n^^2) as one loop for the string, expanding from the middle takes another O(n)
         * Space Complexity: O(1)
         * Two Pointer/ Expand from the middle solution
         *
         */
        
        if (s.length() == 0 || s == null) return "";                
        
        int n = s.length();
        
        for (int i=0; i < n; i++) {
            expandFromMiddle(s, i, i);
        
            if (i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                expandFromMiddle(s, i, i+1);
            }
            
        }                
        
        return s.substring(start, start + max);
    }
    
    public void expandFromMiddle(String s, int l, int r) {   
        
        // logic
        
        while (l >= 0 && r < s.length()) {            
            
            if (s.charAt(l) == s.charAt(r)) {       
                if (max < r - l + 1) {
                    max = r - l + 1;
                    start = l;
                    end = r;
                }                
            } else {
                break;
            }
            l--;
            r++;
        }
    }
}
