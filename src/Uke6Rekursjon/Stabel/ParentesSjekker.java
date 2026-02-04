package Uke6Rekursjon.Stabel;

public class ParentesSjekker {

    LenketStabel<Character> stabel = new LenketStabel<>();

    public boolean sjekkParanteser(String s) {

        boolean paranterErKorrekt = true;
        int i = 0;

        while (paranterErKorrekt && i < s.length()) {
            char c = s.charAt(i);

            if (erStartParentes(c)) {
                stabel.push(c);
            } else if (erSluttParentes(c)) {
                if (!erPerentesPar(stabel.peek(), c)) {
                    paranterErKorrekt = false;
                }
                stabel.pop();
            }
            i++;
        }
        return paranterErKorrekt;
    }


    public boolean erStartParentes(char c) {
        if(c == '{' || c == '[' || c == '(') {
            return true;
        }
        return false;
    }
    public boolean erSluttParentes(char c) {
        if(c == '}' || c == ']' || c == ')') {
            return true;
        }
        return false;
    }
    public boolean erPerentesPar(char start, char slutt) {
        if ((start == '{' && slutt == '}') ||
                (start == '(' && slutt == ')') ||
                start == '[' && slutt == ']') {
            return true;
        }
        return false;
    }
}
