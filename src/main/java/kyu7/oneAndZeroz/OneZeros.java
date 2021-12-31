package kyu7.oneAndZeroz;

import java.util.ArrayList;
import java.util.List;

public class OneZeros {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println(convert(list));
    }

    public static int convert(List<Integer> binaryIntegerList) {
        String binaryValueString = "";
        int decimalValue = 0;

        for (int i = 0; i < binaryIntegerList.size(); i++) {
            binaryValueString += binaryIntegerList.get(i);
        }
        /**
         RADIX: uses base 2; following the example 10 (Decimal)
         2 (Binary)
         8 (Octal)
         16 (Hexadecimal)
         60 (Sexdesimal)
         */
        decimalValue = Integer.parseInt(binaryValueString, 2); // this line change   to decimal.
        return decimalValue;
    }
}