class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0; i < str.length() / 2; i++) {
            int high = str.length() - 1 - i;
            if (str.charAt(i) != str.charAt(high)) return false;
        }
        return true;
    }
}