package kyu6.phoneNumbersGenerator;

public class PhoneNumberGenerator {

    public static String createPhoneNumber(int[] numbers){

        return creatingNumbers(numbers);

    }

    public static String creatingNumbers( int[] numbers ){
        String formattedNumber="";

        formattedNumber = ("(");
        for (int i = 0; i < 3; i++) {
            formattedNumber += Integer.toString(numbers[i]);
        }
        formattedNumber += (") ");

        for (int i = 3; i < 6; i++) {
            formattedNumber += Integer.toString(numbers[i]);
        }
        formattedNumber +=("-");

        for (int i = 6; i < 10; i++) {
            formattedNumber += Integer.toString(numbers[i]);
        }
        return formattedNumber;
    }
}