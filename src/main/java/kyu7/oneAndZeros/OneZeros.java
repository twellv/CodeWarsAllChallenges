package kyu7.oneAndZeros;

import java.util.ArrayList;
import java.util.List;

public class OneZeros {
    public static void main( String[] args ) {
        List list = new ArrayList();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        convert(list);
    }

    public static int convert( List<Integer> binaryIntegerList ) {
        String binaryValueString = "";
        int decimalValue = 0;

        for (int i = 0; i < binaryIntegerList.size(); i++) {
            binaryValueString += binaryIntegerList.get(i);
        }
    //      RADIX: utiliza a base 2; Segue o exemplo 10 (Decimal)
    //                                                2 (Binário)
    //                                                8 (Octal)
    //                                               16 (Hexadecimal)
    //                                               60 (Sexagesimal)
        decimalValue = Integer.parseInt(binaryValueString, 2); // nesse caso vai passar pra binário.
        return decimalValue;
    }
}