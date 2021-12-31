package kyu8.schoolPaperwork;

public class SchoolPaperwork {
    public static void main( String[] args ) {

        System.out.println(countingThePapers(6,5));
    }

    public static int countingThePapers(int numberClassMates, int numberCopies){
        int copies = numberClassMates * numberCopies;

        if(numberClassMates < 0 || numberCopies < 0){
            return 0;
        } else return copies;
    }
}