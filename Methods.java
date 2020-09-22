
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

}
