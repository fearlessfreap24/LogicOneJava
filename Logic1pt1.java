package bat.coding.one.logic;

//Basic boolean logic puzzles -- if else && || !.


public class Logic1pt1 {

    public static void main(String[] args) {
        Logic1pt1 start = new Logic1pt1();
        start.run();
    }

    private void run() {

        int[] nums1 = { 30, 50, 70 };
        boolean[] bools1 = { false, false, true };
        for ( int i = 0; i < nums1.length; i++ ){
            System.out.printf("cigars = %d, isWeekend = %b : %b\n", nums1[i], bools1[i],
                    cigarParty(nums1[i], bools1[i]));
        }
    }

    private boolean cigarParty(int cigars, boolean isWeekend) {

//        When squirrels get together for a party, they like to
//        have cigars. A squirrel party is successful when the
//        number of cigars is between 40 and 60, inclusive. Unless
//        it is the weekend, in which case there is no upper bound
//        on the number of cigars. Return true if the party with the
//        given values is successful, or false otherwise.
//
//        cigarParty(30, false) → false
//        cigarParty(50, false) → true
//        cigarParty(70, true) → true
        if ( isWeekend ){
            return cigars >= 40;
        }
        else return cigars >= 40 && cigars <= 60;
    }
}
