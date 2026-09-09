package ClassProblem;
//Collection
import java.util.*;

public class Demo2 {
 public static void main(String[] args) {
Collection <Integer> c = new ArrayList<>();
c.add(1);
c.add(2);
c.add(3);
c.add(4);
c.add(5);
int n = c.size();
System.out.println(n);
System.out.println(c.isEmpty());
System.out.println(c.contains(10));

Object [] obj = c.toArray();
for(Object o : obj) {
	System.out.println(o);
}

Integer [] arr1 = new Integer[0];
Integer [] arr = c.toArray(arr1);
for(Integer i : arr) {
	System.out.println(i);
}
boolean b = c.add(6);
System.out.println(b);

c.addAll(List.of(5,6,7,8,9,10));
System.out.println(c);

} 
	
 

 
}
