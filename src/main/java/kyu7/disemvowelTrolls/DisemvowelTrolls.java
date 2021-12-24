package kyu7.disemvowelTrolls;

public class DisemvowelTrolls {
    public static void main( String[] args ) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        String regex = "[aeiouAEIOU]";
        String result = str.replaceAll(regex, "");
        return result;
    }
}
// return str.replaceAll("[aeiouAEIOU]", ""); its works!