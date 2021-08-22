package DurgaCollection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.*;

import org.testng.annotations.Test;

public class CollectionOne {
  @Test
  public void f() throws Exception {
  List<Integer> al = new ArrayList();
  Set s = new LinkedHashSet();
  System.out.println(getCapacity(al));
  System.out.println(al.size());
  for(int i = 1; i< 100 ; i++) {
	  al.add(i);
	  System.out.println("adding " + i + " to arraylist, Capacity : " + getCapacity(al));  
  }
  System.out.println(al.size());
  }
 
  static int getCapacity(List al) throws Exception {
	  //using reflections we can get the size of the arrayList
	  Field field = ArrayList.class.getDeclaredField("elementData");
      field.setAccessible(true);
      return ((Object[]) field.get(al)).length;
  }  
}
