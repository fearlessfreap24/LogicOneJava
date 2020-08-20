
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

}
