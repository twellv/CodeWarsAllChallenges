package kyu8.theAnimalsPartyBringDishs;

public class TheFeastOfManyBeasts {
    public static void main( String[] args ) {

    feast("great blue heron","garlic nann");

    }

    public static boolean feast(String beast, String dish) {
        boolean entranceValue = false;
        char a = beast.charAt(0);
        char d = dish.charAt(0);
        int animalLength = beast.length();
        int dishLength = dish.length();
        char lastAnimal = beast.charAt(animalLength - 1);
        char lastDish = dish.charAt(dishLength - 1);

        if (a == d && lastAnimal == lastDish) {
            entranceValue = true;
            System.out.println("You are allowed to enjoy the feast");
        } else{
            System.out.println("You are not allowed");
        }
        return entranceValue;
    }
}