package kyu7.incrementer;

public class Incrementer {
    public static void main(String[] args) {
    }

    public static int[] incrementer(int[] numbers) {
        int integerN = 0;
        String stringS = "";

        for(int i=1; i <= numbers.length; i++) {
            numbers[i-1] = numbers[i-1]+i;

            if(numbers[i-1] >9) {
                stringS = Integer.toString(numbers[i-1]);
                integerN = Integer.parseInt(stringS.substring(stringS.length() - 1));
                numbers[i - 1] = integerN;
            }
        }

        return numbers;
    }
}