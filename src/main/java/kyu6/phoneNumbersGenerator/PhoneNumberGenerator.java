package kyu6.phoneNumbersGenerator;

public class PhoneNumberGenerator {

    public static String createPhoneNumber(int[] numbers){

        return criar(numbers);

    }

    public static String criar( int[] numbers ){
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