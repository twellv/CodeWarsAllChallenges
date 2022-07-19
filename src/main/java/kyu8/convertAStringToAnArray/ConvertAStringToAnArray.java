package kyu8.convertAStringToAnArray;

public class ConvertAStringToAnArray {
    public static void main(String[] args) {
    String phrase = "Game of thrones exthended main theme";
    stringToArray(phrase);
    }

    public static String[] stringToArray(String s) {

        String newArrayString[]= s.split(" ");
        return newArrayString;
    }
}