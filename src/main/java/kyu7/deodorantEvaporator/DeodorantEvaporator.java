package kyu7.deodorantEvaporator;

public class DeodorantEvaporator {
<<<<<<< HEAD
    public static void main(String[] args) {
        System.out.println(evaporator(10,10,5));
    }

    public static int evaporator(double content, double evap_per_day, double threshold) {
        int days = 0;

        Double evaporationPercentage = (evap_per_day / 100);
=======
    public static void main( String[] args ) {
        System.out.println(evaporator(10, 10, 5));
    }

    public static int evaporator( double content, double evap_per_day, double threshold ) {
        int days = 0;
        Double evapaporationPercentage = (evap_per_day / 100);
>>>>>>> cee2e57cebe490e9c5aae28179bd203c382ee8db
        Double thresholdPercentage = (threshold / 100);
        Double minimumThresholdValue = content * thresholdPercentage;

        while (content >= minimumThresholdValue) {
<<<<<<< HEAD
            content -= content * evaporationPercentage; days++;
        }

        return days;
    }
}
=======
            content = content - (content * evapaporationPercentage);
            days++;
        }
        return days;
    }
}
>>>>>>> cee2e57cebe490e9c5aae28179bd203c382ee8db
