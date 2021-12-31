package kyu7.smallestElement;

import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {

    }

    public static int nthSmallest(final int[] simpleArray, final int elementToBeFind) {
        Arrays.sort(simpleArray);
        return simpleArray[elementToBeFind-1];
    }
}