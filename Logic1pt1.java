//package bat.coding.one.logic;

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

//        int[][] nums2 = { {5, 10}, {5, 2}, {5, 5} };
//        for ( int[] nums : nums2 ){
//            System.out.printf("you = %d, date = %d : %d\n", nums[0], nums[1], dateFashion(nums[0], nums[1]));
//        }
    	
//    	int[] nums3 = { 70, 95, 95 };
//    	boolean[] bools3 = { false, false, true };
//    	for ( int i = 0; i < nums3.length; i++ ) {
//    		System.out.printf("temp = %d, isSummer = %b : %b\n", nums3[i], bools3[i],
//    				squirrelPlay(nums3[i], bools3[i]));
//    	}
    	
//    	int[] nums4 = { 60, 65, 65 };
//    	boolean[] bools4 = { false, false, true };
//    	for ( int i = 0; i < nums4.length; i++ ) {
//    		System.out.printf("speed = %d, isBirthday = %b : %d\n", nums4[i], bools4[i],
//    				caughtSpeeding(nums4[i], bools4[i]));
//    	}
    	
//    	int[][] nums5 = { {3, 4}, {9, 4}, {10, 11} };
//    	for ( int[] nums : nums5 ) {
//    		System.out.printf("a = %d, b = %d : %d\n", nums[0], nums[1],
//    				sortaSum(nums[0], nums[1]));
//    	}
    	
//    	int[] nums6 = { 1, 5, 0 };
//    	boolean[] bools6 = { false, false, false };
//    	for ( int i = 0; i < nums6.length; i++ ) {
//    		System.out.printf("day = %d, vacation = %b : %s\n", nums6[i], bools6[i],
//    				alarmClock(nums6[i], bools6[i]));
//    	}
    	
//    	int[][] nums7 = { {6, 4}, {4, 5}, {1, 5}, {-7, 1}, {-2, -4}, {1, 7} };
//    	for ( int[] nums : nums7 ) {
//    		System.out.printf("a = %d, b = %d : %b\n", nums[0], nums[1],
//    				love6(nums[0], nums[1]));
//    	}
    	
//    	int[] nums8 = { 5, 11, 11, 0 };
//    	boolean[] bools8 = { false, false, true, false };
//    	for ( int i = 0; i < nums8.length; i++ ) {
//    		System.out.printf("n = %d, outside = %b : %b\n", nums8[i], bools8[i],
//    				in1to10(nums8[i], bools8[i]));
//    	}
    	
//    	int[] nums9 = { 22, 23, 24 };
//    	for ( int n : nums9 ) {
//    		System.out.printf("n = %d : %b\n", n, specialEleven(n));
//    	}
    	
//    	int[] nums10 = { 20, 21, 22 };
//    	for ( int n : nums10 ) {
//    		System.out.printf("n = %d : %b\n", n, more20(n));
//    	}
    	
//    	int[] nums11 = { 3, 10, 15 };
//    	for ( int n : nums11 ) {
//    		System.out.printf("n = %d : %b\n", n, old35(n));
//    	}
    	
//    	int[] nums12 = { 18, 19, 20 };
//    	for ( int n : nums12 ) {
//    		System.out.printf("n = %d : %b\n", n, less20(n));
//    	}
    	
//    	int[] nums13 = { 12, 17, 19 };
//    	for ( int num : nums13 ) {
//    		System.out.printf("num = %d : %b\n", num, nearTen(num));
//    	}
    	
//    	int[][] nums14 = { {3, 4}, {10, 13}, {13, 2} };
//    	for ( int[] nums : nums14 ) {
//    		System.out.printf("a = %d, b = %d : %d\n", nums[0], nums[1],
//    				teenSum(nums[0], nums[1]));
//    	}
    	
    	boolean[][] bools15 = { {false, false, false}, {false, false, true}, 
    			{true, false, false}, {true, true, true} };
    	for ( boolean[] bools : bools15 ) {
    		System.out.printf("isMorning = %b, isMom = %b, isAsleep = %b : %b\n", bools[0], bools[1], bools[2],
    				answerCell(bools[0], bools[1], bools[2]));
    	}
    	
    	
    }

	private boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

//		Your cell phone rings. Return true if you should answer it. Normally 
//		you answer, 
//		except in the morning you only answer if it is your mom calling. 
//		In all cases, if you are asleep, you do not answer.
//
//		answerCell(false, false, false) → true
//		answerCell(false, false, true) → false
//		answerCell(true, false, false) → false
		return ( isMorning && isMom && !isAsleep ) || ( !isMorning && !isAsleep );
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

    private boolean squirrelPlay(int temp, boolean isSummer) {

//    	The squirrels in Palo Alto spend most of the day playing. 
//    	In particular, they play if the temperature is between 60 
//    	and 90 (inclusive). Unless it is summer, then the upper 
//    	limit is 100 instead of 90. Given an int temperature and a 
//    	boolean isSummer, return true if the squirrels play and false 
//    	otherwise.
//
//		squirrelPlay(70, false) → true
//		squirrelPlay(95, false) → false
//		squirrelPlay(95, true) → true
		
    	return (temp >= 60 && temp <= 90 && !isSummer) 
    			|| ( temp >= 60 && temp <= 100 && isSummer ); 
	}

	private int caughtSpeeding(int speed, boolean isBirthday) {

//		You are driving a little too fast, and a police officer stops 
//		you. Write code to compute the result, encoded as an int value: 
//		0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, 
//		the result is 0. If speed is between 61 and 80 inclusive, the 
//		result is 1. If speed is 81 or more, the result is 2. Unless it is 
//		your birthday -- on that day, your speed can be 5 higher in all cases.
//
//		caughtSpeeding(60, false) → 0
//		caughtSpeeding(65, false) → 1
//		caughtSpeeding(65, true) → 0
		int ticket = 0;
		if ( isBirthday ) speed -= 5;
		if ( speed > 60 && speed <= 80 ) ticket = 1;
		if ( speed > 80 ) ticket = 2;
		return ticket;
		
	}

	private int sortaSum(int a, int b) {

//		Given 2 ints, a and b, return their sum. However, sums in 
//		the range 10..19 inclusive, are forbidden, so in that case 
//		just return 20.
//
//		sortaSum(3, 4) → 7
//		sortaSum(9, 4) → 20
//		sortaSum(10, 11) → 21
		
		int sortasum = a + b;
		if ( sortasum >= 10 && sortasum <= 19 ) return 20;
		return sortasum;
	}

	private String alarmClock(int day, boolean vacation) {

//		Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...
//		6=Sat, and a boolean indicating if we are on vacation, return 
//		a string of the form "7:00" indicating when the alarm clock 
//		should ring. Weekdays, the alarm should be "7:00" and on the 
//		weekend it should be "10:00". Unless we are on vacation -- then 
//		on weekdays it should be "10:00" and weekends it should be "off".
//
//
//		alarmClock(1, false) → "7:00"
//		alarmClock(5, false) → "7:00"
//		alarmClock(0, false) → "10:00"
		if ( day == 0 || day == 6 ) {
			if ( vacation ) return "off";
			return "10:00";
		}
		if ( vacation ) return "10:00";
		return "7:00";
	}

	private boolean love6(int a, int b) {


//		The number 6 is a truly great number. Given two int values, 
//		a and b, return true if either one is 6. Or if their sum or 
//		difference is 6. Note: the function Math.abs(num) computes 
//		the absolute value of a number.
//
//
//		love6(6, 4) → true
//		love6(4, 5) → false
//		love6(1, 5) → true
		return a == 6 || b == 6 || a + b == 6 || a - b == 6
				|| b + a == 6 || b - a == 6;
	}

	private boolean in1to10(int n, boolean outsideMode) {

//		Given a number n, return true if n is in the range 1..10, inclusive. 
//		Unless outsideMode is true, in which case return true if 
//		the number is less or equal to 1, or greater or equal to 10.
//
//
//		in1To10(5, false) → true
//		in1To10(11, false) → false
//		in1To10(11, true) → true
		
		return ( n >= 1 && n <= 10 && !outsideMode )
				|| ( (n <= 1 || n >= 10) && outsideMode );
	}

	private boolean specialEleven(int n) {

//		We'll say a number is special if it is a multiple of 11 or if it 
//		is one more than a multiple of 11. Return true if the given 
//		non-negative number is special. Use the % "mod" operator -- see 
//		Introduction to Mod
//
//		specialEleven(22) → true
//		specialEleven(23) → true
//		specialEleven(24) → false
		return n % 11 == 0 || n % 11 == 1;
	}

	private boolean more20(int n) {

//		Return true if the given non-negative number is 1 or 2 more than a 
//		multiple of 20. See also: Introduction to Mod
//
//		more20(20) → false
//		more20(21) → true
//		more20(22) → true
		return n % 20 == 1 || n % 20 == 2;
	}

	private boolean old35(int n) {

//		Return true if the given non-negative number is a multiple of 3 
//		or 5, but not both. Use the % "mod" operator -- see Introduction 
//		to Mod
//
//		old35(3) → true
//		old35(10) → true
//		old35(15) → false
		return ( n % 3 == 0 || n % 5 == 0 ) && !( n % 3 == 0 && n % 5 == 0 );
	}

	private boolean less20(int n) {

//		Return true if the given non-negative number is 1 or 2 less 
//		than a multiple of 20. So for example 38 and 39 return true, 
//		but 40 returns false. See also: Introduction to Mod
//
//		less20(18) → true
//		less20(19) → true
//		less20(20) → false
		return n % 20 == 18 || n % 20 == 19;
	}

	private boolean nearTen(int num) {

//		Given a non-negative number "num", return true if num is within 
//		2 of a multiple of 10. Note: (a % b) is the remainder of dividing 
//		a by b, so (7 % 5) is 2. See also: Introduction to Mod
//
//		nearTen(12) → true
//		nearTen(17) → false
//		nearTen(19) → true
		return ( num % 10  >= 0 && num % 10 <= 2 ) 
				|| ( num % 10 == 8 || num % 10 == 9 );
	}

	private int teenSum(int a, int b) {

//		Given 2 ints, a and b, return their sum. However, "teen" values 
//		in the range 13..19 inclusive, are extra lucky. So if either value 
//		is a teen, just return 19.
//
//		teenSum(3, 4) → 7
//		teenSum(10, 13) → 19
//		teenSum(13, 2) → 19
		int sum = a + b;
		if ( a >= 13 && a <= 19 ) return 19;
		if ( b >= 13 && b <= 19 ) return 19;
		return sum;
	}
}
