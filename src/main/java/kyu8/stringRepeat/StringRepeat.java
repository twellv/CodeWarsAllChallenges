package kyu8.stringRepeat;

public class StringRepeat {
    public static void main( String[] args ) {

    }

    public static String repeatStr(int nTimes, String currentString ) {
        String newString = "";

        for (int i = 0; i < nTimes; i++) {
            newString += currentString;
        }
        return newString;
    }
}