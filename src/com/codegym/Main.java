package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean res = isPalindrome("raoars");
        if(res){
            System.out.println("is Palindrome");
        }else{
            System.out.println("is not Palindrome");
        }
    }
    private static boolean isPalindrome(String s) {
        int length = s.length();

        if (length < 2)
            return true;
        else {
            if (s.charAt(0) != s.charAt(length - 1))
                return false;
            else
                return isPalindrome(s.substring(1, length - 1));
        }
    }
}
