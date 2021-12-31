package kyu8.sortNstart;

import java.util.Arrays;

public class SortNStart {
    public static void main( String[] args ) {
        String[] arrayAlpha = { "bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        String[] countries  = { "Zimbabwe", "South-Africa", "India", "America",
                                "Yugoslavia", "Australia", "Denmark", "France",
                                "Netherlands", "Italy", "Germany"};

        sortStringList(arrayAlpha);
    }

    public static String sortStringList( String[] arrayString ) {
        Arrays.sort(arrayString);
        String varScope = "";
        char[] charToConvert = {};

        charToConvert = arrayString[0].toCharArray();
        for (int i = 0; i < charToConvert.length; i++) {
            if (i != charToConvert.length-1) {
                varScope += charToConvert[i] + "***";
            } else {
                varScope += charToConvert[i];
            }
        }
        System.out.println(varScope);
        return varScope;
    }
}