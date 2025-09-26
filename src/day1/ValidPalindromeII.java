package day1;

public class ValidPalindromeII {
    public static void main(String[] args){
    }


    public static boolean checkPalindrome(String s, int start, int end, boolean deleted) {
        while (start<end){
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else {
                if (deleted) return false; // Already deleted once
                return checkPalindrome(s, start + 1, end, true) ||
                        checkPalindrome(s, start, end - 1, true);
            }
        }
        return true;
    }


}
