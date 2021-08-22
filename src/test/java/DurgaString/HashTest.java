package DurgaString;

import org.testng.annotations.Test;

import NumToString.NumToStringOp;

public class HashTest {
  @Test
  public void f() {
  int i = 10;
  int j = 20;
  Integer a = 10;
  System.out.println(i==j);
  System.out.println(i==a);
  System.out.println(a.equals(i));//equals method is overridden for content comparison
  
  String s1 = new String("10.00000,'Durga',20.5,USD1d");
  System.out.println(s1.hashCode());
  String s2 = new String("10.00000,'Durga',20.5,USD1d");
  System.out.println(s2.hashCode());
  System.out.println(s1==s2);
  System.out.println(s1.equals(s2));//equals method is overridden for content comparison
  
  String s3 = "10.00000,'Durga',20.5,USD1d";
  System.out.println(s3.hashCode());
  String s4 = "10.00000,'Durga',20.5,USD1d";
  System.out.println(s4.hashCode());
  System.out.println(s3==s4);
  System.out.println(s3.equals(s4));//equals method is overridden for content comparison
  
  NumToStringOp n1 = new NumToStringOp();
  NumToStringOp n2 = new NumToStringOp();
  System.out.println(n1 == n2);
  System.out.println(n1.equals(n2));//equals method not overridden
  
  StringBuffer sb1 = new StringBuffer("durga");
  StringBuffer sb2 = new StringBuffer("durga");
  System.out.println(sb1 == sb2);
  System.out.println(sb1.equals(sb2));//equals method not overridden
  }
}
