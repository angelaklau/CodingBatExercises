/**
 * 
 * http://codingbat.com/java/Warmup-1
 * 
 * @author anlau
 * 
 */

public class CodingBatWarmUp1
{

	/**
	 * http://codingbat.com/prob/p187868 The parameter weekday is true if it is
	 * a weekday, and the parameter vacation is true if we are on vacation. We
	 * sleep in if it is not a weekday or we're on vacation. Return true if we
	 * sleep in.
	 * 
	 */
	public boolean sleepIn(boolean weekday, boolean vacation)
	{
		if (!weekday || vacation)
		{
			return true;
		}
		return false;
	}

	/**
	 * http://codingbat.com/prob/p181646 We have two monkeys, a and b, and the
	 * parameters aSmile and bSmile indicate if each is smiling. We are in
	 * trouble if they are both smiling or if neither of them is smiling. Return
	 * true if we are in trouble.
	 * 
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile)
	{
		if ((aSmile && bSmile) || (!aSmile && !bSmile))
		{
			return true;
		}
		return false;
	}

	/**
	 * http://codingbat.com/prob/p154485 Given two int values, return their sum.
	 * Unless the two values are the same, then return double their sum.
	 * 
	 */
	public int sumDouble(int a, int b)
	{
		int c = a + b;

		if (a == b)
		{
			c = 2 * c;
		}

		return c;
	}

	/**
	 * http://codingbat.com/prob/p116624 Given an int n, return the absolute
	 * difference between n and 21, except return double the absolute difference
	 * if n is over 21.
	 * 
	 */
	public int diff21(int n)
	{
		int c = Math.abs(n - 21);

		if (n > 21)
		{
			c = c * 2;
		}

		return c;
	}

	/**
	 * http://codingbat.com/prob/p140449 We have a loud talking parrot. The
	 * "hour" parameter is the current hour time in the range 0..23. We are in
	 * trouble if the parrot is talking and the hour is before 7 or after 20.
	 * Return true if we are in trouble.
	 * 
	 */
	public boolean parrotTrouble(boolean talking, int hour)
	{
		if (talking && (hour < 7 || hour > 20)) return true;
		return false;
	}

	/**
	 * http://codingbat.com/prob/p182873 Given 2 ints, a and b, return true if
	 * one if them is 10 or if their sum is 10.
	 * 
	 */
	public boolean makes10(int a, int b)
	{
		if (a + b == 10 || a == 10 || b == 10) return true;
		return false;
	}

	/**
	 * http://codingbat.com/prob/p184004 Given an int n, return true if it is
	 * within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value
	 * of a number.
	 * 
	 */
	public boolean nearHundred(int n)
	{
		if ((Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10)) return true;
		return false;
	}

	/**
	 * http://codingbat.com/prob/p159227 Given 2 int values, return true if one
	 * is negative and one is positive. Except if the parameter "negative" is
	 * true, then return true only if both are negative.
	 * 
	 */
	public boolean posNeg(int a, int b, boolean negative)
	{
		if (negative)
		{
			if (a < 0 && b < 0) return true;
		}
		else
		{
			if ((a < 0 && b >= 0) || (a >= 0 && b < 0)) return true;
		}
		return false;
	}

	/**
	 * http://codingbat.com/prob/p191914 Given a string, return a new string
	 * where "not " has been added to the front. However, if the string already
	 * begins with "not", return the string unchanged. Note: use .equals() to
	 * compare 2 strings.
	 * 
	 */
	public String notString(String str)
	{

		if (!str.toLowerCase().startsWith("not"))
		{
			str = "not " + str;
		}
		return str;
	}

	/**
	 * http://codingbat.com/prob/p190570 Given a non-empty string and an int n,
	 * return a new string where the char at index n has been removed. The value
	 * of n will be a valid index of a char in the original string (i.e. n will
	 * be in the range 0..str.length()-1 inclusive).
	 * 
	 */
	public String missingChar(String str, int n)
	{
		String part1 = str.substring(0, n);
		String part2 = str.substring(n + 1);
		str = part1 + part2;
		return str;
	}

	/**
	 * http://codingbat.com/prob/p123384 Given a string, return a new string
	 * where the first and last chars have been exchanged.
	 * 
	 */
	public String frontBack(String str)
	{
		char first;
		char last;
		String stripped;

		if (str.length() <= 1) return str;

		first = str.charAt(0);
		last = str.charAt(str.length() - 1);
		stripped = str.substring(1, str.length() - 1);
		str = last + stripped + first;

		return str;
	}

	/**
	 * http://codingbat.com/prob/p136351 Given a string, we'll say that the
	 * front is the first 3 chars of the string. If the string length is less
	 * than 3, the front is whatever is there. Return a new string which is 3
	 * copies of the front.
	 * 
	 */
	public String front3(String str)
	{
		String front;

		if (str.length() < 3)
		{
			front = str;
		}
		else
		{
			front = str.substring(0, 3);
		}
		str = front + front + front;

		return str;
	}

	/**
	 * http://codingbat.com/prob/p161642 Given a string, take the last char and
	 * return a new string with the last char added at the front and back, so
	 * "cat" yields "tcatt". The original string will be length 1 or more.
	 * 
	 */
	public String backAround(String str)
	{
		char last = str.charAt(str.length() - 1);
		str = last + str + last;

		return str;
	}

	/**
	 * http://codingbat.com/prob/p112564 Return true if the given non-negative
	 * number is a multiple of 3 or a multiple of 5. Use the % "mod" operator --
	 * see Introduction to Mod
	 * 
	 */
	public boolean or35(int n)
	{
		if (n % 3 == 0 || n % 5 == 0)
		{
			return true;
		}
		return false;
	}

	/**
	 * http://codingbat.com/prob/p183592 Given a string, take the first 2 chars
	 * and return the string with the 2 chars added at both the front and back,
	 * so "kitten" yields"kikittenki". If the string length is less than 2, use
	 * whatever chars are there.
	 * 
	 */
	public String front22(String str)
	{
		String first2;

		if (str.length() < 2)
		{
			first2 = str;
		}
		else
		{
			first2 = str.substring(0, 2);
		}

		str = first2 + str + first2;

		return str;
	}

	/**
	 * http://codingbat.com/prob/p191022 Given a string, return true if the
	 * string starts with "hi" and false otherwise.
	 * 
	 */
	public boolean startHi(String str)
	{
		if (str.length() < 2) return false;

		String hi = "hi";
		String start = str.substring(0, 2);

		return (hi.equals(start));

	}

	/**
	 * http://codingbat.com/prob/p192082
	 * 
	 * Given two temperatures, return true if one is less than 0 and the other
	 * is greater than 100.
	 * 
	 */
	public boolean icyHot(int temp1, int temp2)
	{
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0))
		{
			return true;
		}
		return false;
	}

	/**
	 * http://codingbat.com/prob/p144535
	 * 
	 * Given 2 int values, return true if either of them is in the range 10..20
	 * inclusive.
	 * 
	 */
	public boolean in1020(int a, int b)
	{
		if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) return true;
		return false;
	}

	/**
	 * http://codingbat.com/prob/p178986
	 * 
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	 * Given 3 int values, return true if 1 or more of them are teen.
	 * 
	 */
	public boolean hasTeen(int a, int b, int c)
	{
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)
				|| (c >= 13 && c <= 19)) return true;
		return false;
	}

	/**
	 * http://codingbat.com/prob/p165701
	 * 
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	 * Given 2 int values, return true if one or the other is teen, but not
	 * both.
	 * 
	 */
	public boolean loneTeen(int a, int b)
	{
		if (((a >= 13 && a <= 19) && (b < 13 || b > 19))
				|| (b >= 13 && b <= 19) && (a < 13 || a > 19)) return true;
		return false;
	}

	/**
	 * http://codingbat.com/prob/p100905
	 * 
	 * Given a string, if the string "del" appears starting at index 1, return a
	 * string where that "del" has been deleted. Otherwise, return the string
	 * unchanged.
	 * 
	 */
	public String delDel(String str)
	{
		if (str.length() >= 4 && str.substring(1, 4).equalsIgnoreCase("del"))
		{
			String beginning = str.substring(0, 1);
			String ending = str.substring(4);
			str = beginning + ending;
		}
		return str;
	}

	/**
	 * http://codingbat.com/prob/p151713
	 * 
	 * Return true if the given string begins with "mix", except the 'm' can be
	 * anything, so "pix", "9ix" .. all count.
	 * 
	 */
	public boolean mixStart(String str)
	{
		if (str.length() >= 3 && str.substring(1, 3).equalsIgnoreCase("ix"))
		{
			return true;
		}
		return false;
	}

	/**
	 * http://codingbat.com/prob/p199720
	 * 
	 * Given a string, return a string made of the first 2 chars (if present),
	 * however include first char only if it is 'o' and include the second only
	 * if it is 'z', so "ozymandias" yields "oz".
	 * 
	 */
	public String startOz(String str)
	{
		boolean isO = str.length() >= 1
				&& String.valueOf(str.charAt(0)).equalsIgnoreCase("o");
		boolean isZ = str.length() >= 2
				&& String.valueOf(str.charAt(1)).equalsIgnoreCase("z");

		if (isO && isZ)
		{
			return str.substring(0, 2);
		}
		else if (isO)
		{
			return String.valueOf(str.charAt(0));
		}
		else if (isZ)
		{
			return String.valueOf(str.charAt(1));
		}
		else
		{
			return "";
		}
	}

	/**
	 * http://codingbat.com/prob/p101887
	 * 
	 * Given three int values, a b c, return the largest.
	 * 
	 */
	public int intMax (int a, int b, int c)
	{
		if (a >= b)
		{
			if (a >= c)
			{
				return a;
			}
			else 
			{
				if (b >= c)
				{
					return b;
				}
				else
				{
					return c;
				}
			}
		}
		else
		{
			if (b >= c)
			{
				return b;
			}
			else
			{
				if (a >= c)
				{
					return a;
				}
				else
				{
					return c;
				}
			}
		}
	}
	
	/**
	 * http://codingbat.com/prob/p172021
	 * 
	 * Given 2 int values, return whichever value is nearest to the value 10, 
	 * or return 0 in the event of a tie. 
	 * Note that Math.abs(n) returns the absolute value of a number.
	 * 
	 */
	public int close10(int a, int b)
	{
		int aDistance = Math.abs(a - 10);
		int bDistance = Math.abs(b - 10);
		
		if (aDistance > bDistance)
		{
			return b;
		}
		else if (aDistance < bDistance)
		{
			return a;
		}
		else
			return 0;
	}
	
	/**
	 * http://codingbat.com/prob/p132134
	 * 
	 * Given 2 int values, return true if they are both in the range 30..40 inclusive, 
	 * or they are both in the range 40..50 inclusive.
	 * 
	 */
	public boolean in3050(int a, int b)
	{
		if (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)))
				return true;
		return false;
	}
	
	/**
	 * http://codingbat.com/prob/p177372
	 * 
	 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
	 * or return 0 if neither is in that range.
	 */
	public int max1020(int a, int b)
	{
		boolean aInRange = a >= 10 && a <=20;
		boolean bInRange = b >= 10 && b <=20;

		if (aInRange && bInRange)
			return Math.max(a, b);
		else if (aInRange)
			return a;
		else if (bInRange)
			return b;
		else
			return 0;
	}
	
	/**
	 * http://codingbat.com/prob/p173784
	 * 
	 * Return true if the given string contains between 1 and 3 'e' chars.
	 * 
	 */
	public boolean stringE(String str)
	{
		int count = 0;
		while(str.indexOf('e') != -1)
		{
			count++;
			str = str.substring(str.indexOf('e') +1);
		}
		if (count >= 1 && count <=3)
			return true;
		return false;
	}
	
	/**
	 * http://codingbat.com/prob/p125339
	 * 
	 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. 
	 * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
	 * 
	 */
	public boolean lastDigit (int a, int b)
	{
		if (a % 10 == b % 10)
			return true;
		return false;
	}

	/**
	 * http://codingbat.com/prob/p125268
	 * 
	 * Given a string, return a new string where the last 3 chars are now in upper case. 
	 * If the string has less than 3 chars, uppercase whatever is there. 
	 * Note that str.toUpperCase() returns the uppercase version of a string.
	 * 
	 */
	public String endUp (String str)
	{
		if (str.length() <= 3)
			str = str.toUpperCase();
		else
		{
			String last3 = str.substring(str.length() - 3);
			str = str.substring(0, str.length() - 3) + last3.toUpperCase();
		}
		return str;
	}
	
	/**
	 * http://codingbat.com/prob/p196441
	 * 
	 * Given a non-empty string and an int N, return the string made starting with char 0, 
	 * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
	 * 
	 */
	public String everyNth(String str, int n)
	{
		String answer = new String();
		
		for (int i = 0; i < str.length(); i++)
		{
			if (i % n == 0)
				answer += str.charAt(i);
		}
		return answer;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[])
	{
		CodingBatWarmUp1 warmup1 = new CodingBatWarmUp1();

		String ans = warmup1.everyNth("Miracle", 2);
		System.out.println("ans = " + ans);
	}
}
