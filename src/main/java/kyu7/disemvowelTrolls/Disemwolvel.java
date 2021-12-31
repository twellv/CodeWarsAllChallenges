package kyu7.disemvowelTrolls;

public class Disemwolvel {
    public static void main( String[] args ) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    public static String disemvowel(String stringThatReceive) {
        String regex = "[aeiouAEIOU]";
        String result = stringThatReceive.replaceAll(regex, "");
        return result;
    }
}
// return str.replaceAll("[aeiouAEIOU]", ""); its works!