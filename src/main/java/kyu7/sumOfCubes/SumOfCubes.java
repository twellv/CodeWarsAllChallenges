package kyu7.sumOfCubes;

public class SumOfCubes {
    public static void main(String[] args) {
        System.out.println(sumCubes(2));
    }

    static long sumCubes(long n) {
        long result = 0;
         for (long i = 1; i <= n ; i++) result += i * i * i;
         return result;
    }
}