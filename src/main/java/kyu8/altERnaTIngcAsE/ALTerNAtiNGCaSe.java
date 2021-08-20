package kyu8.altERnaTIngcAsE;

import java.util.Locale;

public class ALTerNAtiNGCaSe {
    public static void main( String[] args ) {

        String testing = "HeLLo WoRLD";
        toAlternativeString(testing);

    }

    public static String toAlternativeString(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
}