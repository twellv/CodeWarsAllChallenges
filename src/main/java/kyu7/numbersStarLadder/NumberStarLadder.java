package kyu7.numbersStarLadder;

public class NumberStarLadder {
    public static void main(String[] args) {
        pattern(3);
    }

    static String pattern(int number) {
        String string = "";

        for (int a = 1; a <= number; a++) {

            string += "1";
            for (int b = 1; b < a; b++) {
                string += "*";
            }

            if (a != 1) {
                string += a;
            }

            if (a != number) {
                string += "\n";
            }
        }

        System.out.println(string);
        return string;
    }

}
