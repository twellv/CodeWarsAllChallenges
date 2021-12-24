package kyu8.schoolPaperwork;

public class SchoolPaperwork {
    public static void main( String[] args ) {

        System.out.println(telasca(6,5));
    }

    public static int telasca(int numberClassMates, int numberCopies){
        int copies = numberClassMates * numberCopies;

        if(numberClassMates < 0 || numberCopies < 0){
            return 0;
        } else return copies;
    }
}
//  return (n < 0) || (m < 0) ? 0 : n * m;