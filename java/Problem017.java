/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/ 
public class Problem017
{
	static String[] numbersAsWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
									   "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
									   "", "", "", "", "", "", "", "", "", "thirty", "", "", "", "", "", "", "", "", "", "fourty", "", "", "",
									   "", "", "", "", "", "", "fifty", "", "", "", "", "", "", "", "", "", "sixty", "", "", "", "", "", "",
									   "", "", "", "seventy", "", "", "", "", "", "", "", "", "", "eighty", "", "", "", "", "", "", "", "", "",
									   "ninety", "", "", "", "", "", "", "", "", "" };

	public static String toWords(int number)
	{
		String result = "";

		if ( number > 0 && number <= 20 ) 
			result = numbersAsWords[number];
		else if ( number > 20 && number <= 29 ) 
			result = "twenty" + numbersAsWords[number-20];
		else if ( number == 30 )
			result = "thirty";
		else if ( number > 30 && number <= 39 )
			result = "thirty" + numbersAsWords[number-30];
		else if ( number == 40 )
			result = "forty";
		else if ( number > 40 && number <= 49 )
			result = "forty" + numbersAsWords[number-40];
		else if ( number == 50 )
			result = "fifty";
		else if ( number > 50 && number <= 59 )
			result = "fifty" + numbersAsWords[number-50];
		else if ( number == 60 )
			result = "sixty";
		else if ( number > 60 && number <= 69 )
			result = "sixty" + numbersAsWords[number-60];
		else if ( number == 70 )
			result = "seventy";
		else if ( number > 70 && number <= 79 )
			result = "seventy" + numbersAsWords[number-70];
		else if ( number == 80 ) 
			result = "eighty";
		else if ( number > 80 && number <= 89 )
			result = "eighty" + numbersAsWords[number-80];
		else if ( number == 90 )
			result = "ninety";
		else if ( number > 90 && number <= 99 )
			result = "ninety" + numbersAsWords[number-90];
		else if ( number == 100 )
			result = "one" + "hundred";
		else if ( number > 100 && number <= 999 ) {

			if ( number - ( ( number / 100 ) * 100 ) == 0 )
				result = numbersAsWords[ number / 100 ] + "hundred";
			else
				result = numbersAsWords[ number / 100 ] + "hundred" + "and" + toWords( number - ( ( number / 100 ) * 100 ) );

		}
		else if ( number == 1000 )
			result = "one" + "thousand";
		else
			result = "";

		System.out.println(number + " : " + result);
		return result;

	}

	public static void main(String[] args)
	{
		String masterString = "";

		for (int i = 1; i <= 1000; i++) {

			masterString += toWords(i);

		}

		System.out.println("\nAnswer:  " + masterString.length());

		
	}

}
