package kyu8.multiplicationTableForNumber;

public class MultiplicationTableForNumber {
    public static void main( String[] args ) {

        System.out.println(multiTable(5));
    }

    public static String multiTable( int n ) {

        String str = "";

        for (int i = 1; i <= 10; i++) {

            int res = i * n;
            if (i == 10) {
                str += i + " * " + n + " = " + res;
            } else {
                str += i + " * " + n + " = " + res + "\n";
            }

        }
        return str;
    }
}