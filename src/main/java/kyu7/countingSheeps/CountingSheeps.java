package kyu7.countingSheeps;

public class CountingSheeps {
    public static void main(String[] args) {
        int[] sexta = {1, 2};
        int[] sabado = {3, 4};
        int total = 15;

        System.out.println(lostSheep(sexta,sabado,total));
    }

    static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {

        for (int i : fridayNightCounting) sheepTotal -= 1;
        for (int i : saturdayNightCounting) sheepTotal -= 1;

        return sheepTotal;
    }
}