package Uke6Rekursjon.Oppgave2;

public class Palindrom {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) { //Basissteg
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));

    }
}

//O(n^2)
