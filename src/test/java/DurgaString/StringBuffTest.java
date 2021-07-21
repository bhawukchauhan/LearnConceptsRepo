package DurgaString;

import org.testng.annotations.Test;

public class StringBuffTest {
	@Test
	public void f1() {
String s = new String("durga");
s.concat("software");
// String is immutable, so a new Object will be created with content durgasoftware
// but we have not assigned this newly created object to any reference variable,
// so it will be garbage collected
System.out.println(s);// durga

StringBuffer sb = new StringBuffer("durga");
sb.append("software");
System.out.println(sb);// durgasoftware
	}
	
	
	@Test
	public void f2() {
String s1 = new String("durga");
String s2 = new String("durga");

//Double Equal == operator always meant for reference comparison
//If both the references pointing to the same Object, then only == is going to return true
//Whenever we use new, compulsarily a new Object will be created
//In the case of a new String object, total of two objects will be created
//One in heap and 2nd one in SCP with Literal content
System.out.println(s1==s2);//false
System.out.println(s1.equals(s2));//true

StringBuffer sb1 = new StringBuffer("durga");
StringBuffer sb2 = new StringBuffer("durga");
System.out.println(sb1==sb2);//false
System.out.println(sb1.equals(sb2));//false
System.out.println(sb1.compareTo(sb2)); //0

//Anything which is inside "", aka literals, an object will be created once in SCP(String Constant Pool)
//if another reference variable is created with same content(Literal), no new object will be created in SCP
//this new variable will be pointing to the same object in SCP
String s3 = "durga";
String s4 = "durga";
System.out.println(s3==s4);//true
System.out.println(s3.equals(s4));//true

int i = 10;
int j = 10;
System.out.println(i==j);

	}
}
