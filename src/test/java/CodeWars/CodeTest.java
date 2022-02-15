package CodeWars;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class CodeTest {
	@Test
	public void f() {
		System.out.println("Camel case challenge");
		
		// String strToConvert = "The_Stealth_Warrior";
		//String strToConvert = "The_stealth";
		//String strToConvert = "the-stealth-warrior";
		String strToConvert = "the-stealth_warrior";
		System.out.println("strToConvert : " + strToConvert);
		/*
		 * 
		 * String[] ary = null; if (strToConvert.contains("-")) ary =
		 * strToConvert.split("-"); else if (strToConvert.contains("_")) ary =
		 * strToConvert.split("_"); System.out.println("str array : " +
		 * Arrays.toString(ary));
		 * 
		 * String strConverted = ary[0]; System.out.println("strConverted : " +
		 * strConverted); for (int i = 1; i < ary.length; i++) { String strTemp =
		 * ary[i]; strTemp = strTemp.substring(0, 1).toUpperCase() +
		 * strTemp.substring(1); System.out.println("strTemp : " + strTemp);
		 * strConverted = strConverted + strTemp; }
		 */
		System.out.println("strConverted : " + toCamelCase(strToConvert));
		System.out.println("strConverted : " + toCamelCaseRegex(strToConvert));

	}

	static String toCamelCase(String s) {

		if (s == null || s.isBlank())
			return "";

		System.out.println("valid input");
		String[] ary = null;
		if (s.contains("-"))
			ary = s.split("-");
		else if (s.contains("_"))
			ary = s.split("_");

		String strConverted = ary[0];

		if (ary.length >= 2) {
			for (int i = 1; i < ary.length; i++) {
				String strTemp = ary[i];
				strTemp = strTemp.substring(0, 1).toUpperCase() + strTemp.substring(1);
				strConverted = strConverted + strTemp;
			}
		}
		return strConverted;
	}
	
	static String toCamelCaseRegex(String s) {

		if (s == null || s.isBlank())
			return "";
		
	    Matcher m = Pattern.compile("[_-](\\w)").matcher(s);
	    StringBuffer sb = new StringBuffer();
	    System.out.println("sb regex: " + sb.toString());
	    //sb.append("string add to sb");
	    //System.out.println("sb regex: " + sb.toString());
	    while (m.find()) {
	    	System.out.println("matcher group before replace: " + m.group());
	    	System.out.println("matcher start before replace: " + m.start());
	    	System.out.println("matcher end before replace: " + m.end());
	    	System.out.println("matcher group before replace: " + m.group(1));
	    	System.out.println("sb before regex: " + sb.toString());
	        m.appendReplacement(sb, m.group(1).toUpperCase());
	        System.out.println("matcher group after replace: " + m.end());
	        System.out.println("sb after regex: " + sb.toString());
	    }
	    System.out.println("valid input regex: " + m.toString());
	    System.out.println("valid input regex: " + sb.toString());
	    //return m.appendTail(sb).toString();
	    System.out.println("valid input regex: " + m.appendTail(sb).toString());

		System.out.println("valid input");
		String[] ary = null;
		if (s.contains("-"))
			ary = s.split("-");
		else if (s.contains("_"))
			ary = s.split("_");

		String strConverted = ary[0];

		if (ary.length >= 2) {
			for (int i = 1; i < ary.length; i++) {
				String strTemp = ary[i];
				strTemp = strTemp.substring(0, 1).toUpperCase() + strTemp.substring(1);
				strConverted = strConverted + strTemp;
			}
		}
		return strConverted;
	}

}
