package DurgaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegexOne {
  @Test
  public void f() {
  //notice spaces between patterns
  Pattern p = Pattern.compile("a+");
  Matcher m = p.matcher("abaabaaab");
  
  //int count=0;
  while(m.find()) {
	  //count++;
	  System.out.println(m.start() + "..." + m.group());
  }
  //System.out.println("Number of occurences are : " + count);
  }
  
  @Test
  public void fTwo() {
  //Pattern p = Pattern.compile("\\.");//both means same \\. or [.]
  Pattern p = Pattern.compile("[.]");
  String[] s = p.split("www.durgasoft.com");
  for (String s1:s)
	  System.out.println(s1);
  }
}
