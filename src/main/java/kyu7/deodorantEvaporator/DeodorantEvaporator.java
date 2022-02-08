package kyu7.deodorantEvaporator;

public class DeodorantEvaporator {
    public static void main( String[] args ) {
        System.out.println(evaporator(10, 10, 5));
    }

    public static int evaporator( double content, double evap_per_day, double threshold ) {
        int days = 0;
        Double evapaporationPercentage = (evap_per_day / 100);
        Double thresholdPercentage = (threshold / 100); //  0,05
        Double minimumThresholdValue = content * thresholdPercentage; // 0,5ml

        while (content >= minimumThresholdValue) {
            content = content - (content * evapaporationPercentage);
            days++;
        }
        return days;
    }
}