package day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {

	/*
	 * Used for Pattern matching username - 123455 email -username@domain.com
	 * contact - 10 digits password - lower/upper/number/spl char - 8 char
	 * 
	 * 
	 * testing 9999955555878 email text
	 * 
	 * 
	 * 
	 * Quantifiers a? - a occurs - 0 or 1 a+ - a occurs once or more times a* - a
	 * occurs 0 or more times a{n} - a occurs n times only a{n,} - a occurs n or
	 * more times a{n,m} - a occurs at least n times and less than m times
	 * 
	 * a{5} a{5,} a{5,10}
	 * 
	 * 
	 * 10.0.0.1 20.0.0.1 1.0.0.0 255.255.255.0
	 * 
	 * pattern = \d\d\.\d\.\d\.\d = \d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}
	 * 
	 * = [0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}
	 * 
	 * [0-5][0-9] - 00 - 59
	 * 
	 * String str = "user@gmail.com" String str1 = "user_12@gmail.com
	 * 
	 * pattern = \w{3,}@\w{2,}\.\w{1,} = \w+@\w+\.\w+ = [a-zA-Z]+@[a-z]+\.[a-z]{1,3}
	 * 
	 * String str2 = "044-12349876" pattern = \d{3}-\d{6,8} = [0-9]{3}-[0-9]{6,8}
	 * 
	 * 
	 * String str3 = "mr." String str4 = "mrs."
	 * 
	 * pattern = "mrs?\."
	 * 
	 * Metacharacters: . - single character \d - any digit [0-9] \D - Any non digit
	 * [^0-9] \s - Any whitespace char [\t\n\f\r\x0B] \S - Any non white-space char
	 * \w - Any word char [a-zA-Z0-9_] \W - Any non word char
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// String str3 = "mrs.";
		String str3 = "mr.";
		Pattern p = Pattern.compile("mrs?\\.");// . represents single character
		Matcher m = p.matcher(str3);
		boolean b = m.matches();

		System.out.println(b);

		boolean b2 = Pattern.compile(".s").matcher("*s").matches();
		System.out.println(b2);

		boolean b3 = Pattern.matches("mrs?\\.", "mr"); // false
		System.out.println(b3);

		String str2 = "044-12349876";
		System.out.println(Pattern.matches("[0-9]{3}-[0-9]{6,8}", str2));

		String str4 = "user@gmail.com";
		String str5 = "user_12@gmail.com";
		String str6 = "user123@yahoo.co.in";

		System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.\\w{1,}", str6)); // false
		System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.\\w{1,}.*", str6)); // true
		System.out.println(Pattern.matches("\\w{3,}@.*", str5)); // true

		/*
		 * flyingreturn.base@airindia.in star.retros@airindia.in
		 * 
		 * 1860 233 1407
		 * 
		 * 020-26231407
		 * 
		 * 0930 hrs - 1730 hrs
		 * 
		 * MTNL / BSNL
		 * 
		 * + 91 124 2641407 (International call rates applicable)
		 * 
		 * 
		 * 
		 */
		// flyingreturn.base@airindia.in
		String str7 = "flyingreturn.base@airindia.in";
		String str8 = "star.retros@airindia.in";
		String p3 = "\\w{4,}\\.\\w{3,}(@\\w{2,}\\.\\w{2})";
		// System.out.println(Pattern.matches("\\w{4,}\\.\\w{3,}@\\w{2,}\\.\\w{2}",str7
		// ));
		// System.out.println(Pattern.matches("\\w{4,}\\.\\w{3,}@\\w{2,}\\.\\w{2}",str8
		// ));
		Pattern p2 = Pattern.compile(p3);
		Matcher m2 = p2.matcher(str7);
		System.out.println(m2.matches());
		System.out.println(m2.group(0));
		System.out.println(m2.group(1));

		// for star.retros@airindia.in
		Matcher m3 = p2.matcher(str8);
		System.out.println(m3.matches());
		System.out.println(m3.group(0));
		System.out.println(m3.group(1));

		// 020-26231407

		String str9 = "020-26231407";
		// System.out.println(Pattern.matches("[0-9]{3}-[0-9]{6,8}",str9 ));
		String pattern = "([0-9]{3})-([0-9]{6,8})";
		Pattern p1 = Pattern.compile(pattern);
		Matcher m1 = p1.matcher(str9);
		System.out.println(m1.matches());
		System.out.println(m1.group(0));
		System.out.println(m1.group(1));
		System.out.println(m1.group(2));

		// 1860 233 1407
		String str10 = "1860 233 1407";
		String pat = "([0-9]{4})\\s([0-9]{3})\\s([0-9]{4})";
		System.out.println(Pattern.matches("([0-9]{4})\\s([0-9]{3})\\s([0-9]{4})", str10));
		Pattern p4 = Pattern.compile(pat);
		Matcher m4 = p4.matcher(str10);
		System.out.println(m4.matches());
		System.out.println(m4.group(0));
		System.out.println(m4.group(1));
		System.out.println(m4.group(2));
		System.out.println(m4.group(3));
		
		//0930 hrs - 1730 hrs
		String str11="0930 hrs - 1730 hrs";
		String pat1="[0-9]{4}\\s hrs\\s-\\s[0-9]{4}\\s hrs";
		System.out.println(Pattern.matches("[0-9]{4}\\shrs\\s-\\s[0-9]{4}\\shrs", str11));
	}

}
