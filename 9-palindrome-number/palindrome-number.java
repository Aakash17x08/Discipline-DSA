class Solution {
    public boolean isPalindrome(int n) {
        if(n < 0) return false;
        int rev = 0;
        int x = n;
        while(x > 0){

            int lastnum = x % 10;
            x /= 10;

            rev = (rev*10)+lastnum;
        }

        return n == rev;
    }
}