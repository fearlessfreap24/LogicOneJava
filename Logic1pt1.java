package bat.coding.one.logic;

//Basic boolean logic puzzles -- if else && || !.


public class Logic1pt1 {

    public static void main(String[] args) {
        Logic1pt1 start = new Logic1pt1();
        start.run();
    }

    private void run() {

//        int[] nums1 = { 30, 50, 70 };
//        boolean[] bools1 = { false, false, true };
//        for ( int i = 0; i < nums1.length; i++ ){
//            System.out.printf("cigars = %d, isWeekend = %b : %b\n", nums1[i], bools1[i],
//                    cigarParty(nums1[i], bools1[i]));
//        }

        int[][] nums2 = { {5, 10}, {5, 2}, {5, 5} };
        for ( int[] nums : nums2 ){
            System.out.printf("you = %d, date = %d : %d\n", nums[0], nums[1], dateFashion(nums[0], nums[1]));
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

    private int dateFashion(int you, int date) {

//        You and your date are trying to get a table at a restaurant.
//        The parameter "you" is the stylishness of your clothes, in
//        the range 0..10, and "date" is the stylishness of your date's
//        clothes. The result getting the table is encoded as an int value
//        with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8
//        or more, then the result is 2 (yes). With the exception that if
//        either of you has style of 2 or less, then the result is 0 (no).
//        Otherwise the result is 1 (maybe).
//
//        dateFashion(5, 10) → 2
//        dateFashion(5, 2) → 0
//        dateFashion(5, 5) → 1
        if ( you <= 2 || date <= 2 ){
            return 0;
        }
        if ( you > 2 && you < 8 && date > 2 && date < 8 ){
            return 1;
        }
        return 2;
    }
}
