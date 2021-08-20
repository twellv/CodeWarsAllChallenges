package kyu6.arraybothsides;

public class EqualSidesOfAnArray {
    public static void main( String[] args ) {

        int[] integerArray = {1, 2, 3, 4, 5, 7, 4, 4, 3, 2, 1};

        theProxy(integerArray);

    }

    public static void theProxy( int[] array ) {
        int n = 0;
        int resFinal = 0;

        for (int a = 0; a < array.length; a++) {

            int resSoma = 0;
            int resDireita = 0;
            int resEsquerda = 0;

            for (int b = a; b < array.length; b++) {
                resDireita += array[b];
            }
            System.out.println("direita: "+resDireita);
            for (int c = a; c < array.length; c++) {
                resEsquerda += array[c];
            }


            if (resEsquerda == resDireita) {
                System.out.println("GG");
                System.exit(1);
            } else {
                System.out.println("-1");
            }
        }
    }

}