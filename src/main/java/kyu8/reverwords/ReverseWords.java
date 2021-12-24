package kyu8.reverwords;

public class ReverseWords {

    public static String reverseWords( String str ) {
        str = str.trim();

        StringBuilder reversedWord = new StringBuilder();
        StringBuilder subWord = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            if (currentChar != ' ') {
                subWord.append(currentChar);
            } else {
                reversedWord.insert(0, currentChar + subWord.toString());
                subWord.setLength(0);
            }

        }

        return reversedWord.insert(0, subWord.toString()).toString();
    }
}