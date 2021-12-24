package kyu8.squashTheBugs;

public class SquashTheBugs {
    public static void main( String[] args ) {

        System.out.println(findLongest("Kakaroto9 Monkey SSJ3"));
    }

    public static int findLongest( final String str ) {

        String[] spl = str.split(" ");
        int longest = 0;

        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }
}