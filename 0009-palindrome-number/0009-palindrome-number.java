class Solution { // Define the Solution class
    public boolean isPalindrome(int x) { 
        if (x <0) return false; 
        if (x >=0 && x < 10) return true; 
        
        int original = x; 
        int reversed = 0; 
        
        while (x >0) {   int digit = x %10; 
            reversed = reversed * 10 + digit; 
            x = x / 10; 
        }
        
        
        return original == reversed; 
    }
}
