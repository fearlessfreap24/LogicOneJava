//package bat.coding.one.logic;

//Basic boolean logic puzzles -- if else && || !.


public class Methods {

	public int teaParty(int tea, int candy) {

//		We are having a party with amounts of tea and candy. Return 
//		the int outcome of the party encoded as 
//		0=bad, 
//		1=good, or 
//		2=great. 
//		A party is good (1) if both tea and candy are at least 5. 
//		However, if either tea or candy is at least double the amount 
//		of the other one, the party is great (2). However, in all cases, 
//		if either tea or candy is less than 5, the party is always bad (0).
//
//		teaParty(6, 8) → 1
//		teaParty(3, 8) → 0
//		teaParty(20, 6) → 2
		if ( tea < 5 || candy < 5 ) return 0;
		if ( tea >= 5 && candy >= tea * 2 ) return 2;
		if ( candy >= 5 && tea >= candy * 2 ) return 2;
		return 1;
	}

	public String fizzString(String str) {

//		Given a string str, if the string starts with "f" return "Fizz". If 
//		the string ends with "b" return "Buzz". If both the "f" and "b" 
//		conditions are true, return "FizzBuzz". In all other cases, return 
//		the string unchanged. (See also: FizzBuzz Code)
//
//		fizzString("fig") → "Fizz"
//		fizzString("dib") → "Buzz"
//		fizzString("fib") → "FizzBuzz"
		if ( str.length() == 0 ) return str;
		String[] strSplit = str.split("");
		if ( strSplit[0].equals("f") && strSplit[strSplit.length - 1].equals("b") ) {
			return "FizzBuzz";
		}
		if ( strSplit[0].equals("f") ) return "Fizz";
		if ( strSplit[strSplit.length - 1].equals("b") ) return "Buzz";
		return str;
	}

	public String fizzString2(int n) {

//		Given an int n, return the string form of the number followed by "!". So 
//		the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" 
//		instead of the number, and if the number is divisible by 5 use "Buzz", and 
//		if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator 
//		computes the remainder after division, so 23 % 10 yields 3. What will the 
//		remainder be when one number divides evenly into another? (See also: FizzBuzz 
//		Code and Introduction to Mod)
//
//		fizzString2(1) → "1!"
//		fizzString2(2) → "2!"
//		fizzString2(3) → "Fizz!"
		if ( n % 3 == 0 && n % 5 == 0 ) return "FizzBuzz!";
		if ( n % 3 == 0 ) return "Fizz!";
		if ( n % 5 == 0 ) return "Buzz!";
		return Integer.toString(n) + "!";
	}

	public boolean twoAsOne(int a, int b, int c) {

//		Given three ints, a b c, return true if it is possible to add two of the ints to 
//		get the third.
//
//		twoAsOne(1, 2, 3) → true
//		twoAsOne(3, 1, 2) → true
//		twoAsOne(3, 2, 2) → false
		return ( a + b == c || a + c == b || b + c == a );
	}

	public boolean inOrder(int a, int b, int c, boolean bOk) {

//		Given three ints, a b c, return true if b is greater than a, and c is greater than 
//		b. However, with the exception that if "bOk" is true, b does not need to be greater 
//		than a.		
//
//		inOrder(1, 2, 4, false) → true
//		inOrder(1, 2, 1, false) → false
//		inOrder(1, 1, 2, true) → true
		boolean ab = b > a;
		boolean bc = c > b;
		return ( ab && bc && !bOk ) || ( bc && bOk );
	}

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

//		Given three ints, a b c, return true if they are in strict increasing order, such as 
//		2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" 
//		is true, equality is allowed, such as 5 5 7 or 5 5 5.
//
//		inOrderEqual(2, 5, 11, false) → true
//		inOrderEqual(5, 7, 6, false) → false
//		inOrderEqual(5, 5, 7, true) → true
		boolean ab = b > a;
		boolean bc = c > b;
		boolean abeq = b >= a;
		boolean bceq = c >= b;
		return ( ab && bc && !equalOk ) || ( abeq && bceq && equalOk );
	}

	public boolean lastDigit(int a, int b, int c) {

//		Given three ints, a b c, return true if two or more of them have the same rightmost 
//		digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, 
//		e.g. 17 % 10 is 7.
//
//		lastDigit(23, 19, 13) → true
//		lastDigit(23, 19, 12) → false
//		lastDigit(23, 19, 3) → true

		String strA = Integer.toString(a);
		String strB = Integer.toString(b);
		String strC = Integer.toString(c);

		if (strA.substring(strA.length()-1).equals(strB.substring(strB.length()-1))) return true;
		if (strA.substring(strA.length()-1).equals(strC.substring(strC.length()-1))) return true;
		if (strC.substring(strC.length()-1).equals(strB.substring(strB.length()-1))) return true;

		return false;
	}

	public boolean lessBy10(int a, int b, int c) {

//		Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
//
//		lessBy10(1, 7, 11) → true
//		lessBy10(1, 7, 10) → false
//		lessBy10(11, 1, 7) → true

		if ((a <= b-10) || (a <= c-10)) return true;
		if ((b <= a-10) || (b <= c-10)) return true;
		if ((c <= a-10) || (c <= b-10)) return true;

		return  false;
	}

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {

//		Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, 
//		if the two dice show the same value, increment one die to the next value, wrapping around to 1 if 
//		its value was 6.
//
//		withoutDoubles(2, 3, true) → 5
//		withoutDoubles(3, 3, true) → 7
//		withoutDoubles(3, 3, false) → 6

		if (noDoubles) {
			if ( die1 == die2 ) {
				if (die1 == 6) {
					return 1 + die2;
				}
				return die1+die2+1;
			}
		}
		return die1+die2;
	}


	public int redTicket(int a, int b, int c) {

//		You have a red lottery ticket showing ints a, b, and c, each of which is 0, 
//		1, or 2. If they are all the value 2, the result is 10. Otherwise if they 
//		are all the same, the result is 5. Otherwise so long as both b and c are 
//		different from a, the result is 1. Otherwise the result is 0.
//
//		redTicket(2, 2, 2) → 10
//		redTicket(2, 2, 1) → 0
//		redTicket(0, 0, 0) → 5
		
		if ( a == 2 && a == b && b == c ) return 10;
		if ( a == b && b == c ) return 5;
		if ( b != a && c != a ) return 1;
		return 0;
	}

	public int greenTicket(int a, int b, int c) {

//		You have a green lottery ticket, with ints a, b, and c on it. If the numbers are 
//		all different from each other, the result is 0. If all of the numbers are the same, 
//		the result is 20. If two of the numbers are the same, the result is 10.
//
//		greenTicket(1, 2, 3) → 0
//		greenTicket(2, 2, 2) → 20
//		greenTicket(1, 1, 2) → 10
		
		if ( a == b && b == c ) return 20;
		if ( a == b || b == c || c == a ) return 10;
		return 0;
	}

	public int blueTicket(int a, int b, int c) {

//		You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, 
//		which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If 
//		any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 
//		more than either bc or ac sums, the result is 5. Otherwise the result is 0.
//
//		blueTicket(9, 1, 0) → 10
//		blueTicket(9, 2, 0) → 0
//		blueTicket(6, 1, 4) → 10
		
		int ab = a + b;
		int bc = b + c;
		int ca = c + a;
		int ab10 = ab - 10;
		
		if ( ab == 10 || bc == 10 || ca == 10 )return 10;
		if ( ab10 == bc || ab10 == ca ) return 5;
		return 0;
	}

	public boolean shareDigit(int a, int b) {

//		Given two ints, each in the range 10..99, return true if there is a digit that appears 
//		in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left
//		digit while the % "mod" n%10 gives the right digit.)
//
//		shareDigit(12, 23) → true
//		shareDigit(12, 43) → false
//		shareDigit(12, 44) → false
		
		return ( a/10 == b/10 || a%10 == b/10 || a/10 == b%10 || a%10 == b%10 );
	}

	public int sumLimit(int a, int b) {

//		Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same 
//		number of digits as a. If the sum has more digits than a, just return a without b. 
//		(Note: one way to compute the number of digits of a non-negative int n is to convert 
//		it to a string with String.valueOf(n) and then check the length of the string.)
//
//		sumLimit(2, 3) → 5
//		sumLimit(8, 3) → 8
//		sumLimit(8, 1) → 9
		
		int ab = a + b;
		String strA = Integer.toString(a);
		String strAB = Integer.toString(ab);
		
		int retint = strA.length() == strAB.length() ? ab : a;
		
		return retint;
	}

	public int maxMod(int a, int b) {

//		Given two int values, return whichever value is larger. However if the two values have 
//		the same remainder when divided by 5, then the return the smaller value. However, in all 
//		cases, if the two values are the same, return 0. Note: the % "mod" operator computes the 
//		remainder, e.g. 7 % 5 is 2.
//
//		maxMod5(2, 3) → 3
//		maxMod5(6, 2) → 6
//		maxMod5(3, 2) → 3
		
		if ( a == b ) return 0;
		if ( a%5 == b%5 ){
		  return Integer.min(a, b);
		}
		return Integer.max(a, b);
	}
}
