package kyu6.arraybothsides;

public class EqualSidesOfAnArray {
    public static void main(String[] args) {

        int[] integerArray = {1, 2, 3, 4, 5, 7, 4, 4, 3, 2, 1};

        theProxy(integerArray);

    }

    public static void theProxy(int[] array) {
        int n = 0;
        int finalResult = 0;

        for (int i = 0; i < array.length; i++) {

            int sum = 0;
            int rightSideAwser = 0;
            int leftSideAwser = 0;

            for (int b = i; b < array.length; b++) {
                rightSideAwser += array[b];
            }
            System.out.println("right: " + rightSideAwser);
            for (int c = i; c < array.length; c++) {
                leftSideAwser += array[c];
            }


            if (leftSideAwser == rightSideAwser) {
                System.out.println("GG");
                System.exit(1);
            } else {
                System.out.println("-1");
            }
        }
    }

}