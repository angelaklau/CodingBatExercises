
public class CodingBatWarmUp2
{
	/**
	 * http://codingbat.com/prob/p142270
	 * 
	 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
	 * 
	 */
	public String stringTimes(String str, int n)
	{
		String newStr = new String();
		
		for (int i = 0; i < n; i++)
		{
			newStr = newStr.concat(str);
		}
		return newStr;
	}
	
	/**
	 * http://codingbat.com/prob/p101475
	 * 
	 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
	 * or whatever is there if the string is less than length 3. Return n copies of the front;
	 */
	public String frontTimes(String str, int n)
	{
		String newStr = new String();
		String first3 = new String();
		
		if (str.length() <= 3)
		{
			first3 = str;
		}
		else
		{
			first3 = str.substring(0, 3);
		}
		
		for (int i = 0; i < n; i++)
		{
			newStr = newStr.concat(first3);
		}
		return newStr;
	}
	
	/**
	 * http://codingbat.com/prob/p194667
	 * 
	 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, 
	 * so "xxx" contains 2 "xx".
	 */
	public int countXX(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if(str.length() >= i+2 && str.substring(i, i+2).equalsIgnoreCase("xx"))
				count++;
		}
		return count;
	}
	
	/**
	 * http://codingbat.com/prob/p186759
	 * 
	 * Given a string, return true if the first instance of "x" in the string is immediately 
	 * followed by another "x".
	 * 
	 */
	public boolean doubleX(String str)
	{
		boolean ans = false;
		
		int firstIndex = str.indexOf('x');
		
		if (firstIndex != str.length()-1 && firstIndex != -1 )
		{			
			if ((str.charAt((firstIndex+1))) == 'x')
				ans = true;
		}
			
		return ans;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		CodingBatWarmUp2 warmup2 = new CodingBatWarmUp2();
		boolean answer = warmup2.doubleX("axcb");
		System.out.println("ans = " + answer);

	}

}
