package kyu7.incrementer;

public class Incrementer {
    public static void main(String[] args) {
    }

    public static int[] incrementer(int[] numbers) {
        int integerN = 0;
        String stringS = "";

<<<<<<< HEAD
        for(int i=1; i <= numbers.length; i++) {
            numbers[i-1] = numbers[i-1]+i;

            if(numbers[i-1] >9) {
                stringS = Integer.toString(numbers[i-1]);
=======
        for (int i = 1; i <= numbers.length; i++) {

            numbers[i-1] = numbers[i-1]+i;
            if (numbers[i - 1] > 9) {
                stringS = Integer.toString(numbers[i - 1]);
>>>>>>> cee2e57cebe490e9c5aae28179bd203c382ee8db
                integerN = Integer.parseInt(stringS.substring(stringS.length() - 1));
                numbers[i - 1] = integerN;
            }
        }
<<<<<<< HEAD

=======
>>>>>>> cee2e57cebe490e9c5aae28179bd203c382ee8db
        return numbers;
    }
}