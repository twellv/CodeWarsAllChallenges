package kyu8.sumOfDifferences;


import java.util.Arrays;

public class SumOfDifference {
    public static void main(String[] args) {
        int vetorNoMain[] = {2, 1, 10};
        sumOfDifferences(vetorNoMain);
    }

    public static int sumOfDifferences(int[] arr) {
        int sum, result = 0, index1 = arr.length - 1, index2 = index1 - 1;
        Arrays.sort(arr);

        while (index1 > 0) {
            sum = arr[index1] - arr[index2];
            result += sum;

            index1 = index1 - 1;
            index2 = index2 - 1;
        }
        return result;
    }
}