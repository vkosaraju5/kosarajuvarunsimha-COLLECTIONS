package listoperations;
import java.util.ArrayList;
import java.util.Iterator;
public class Operations {
 static ArrayList arr = new ArrayList(10);
 int fetchElements(int index)
 {
	
	 return (Integer) arr.get(index);
	 
 }
 void AddElement(int ele)
 {
	 arr.add(ele);
	 System.out.println("Element is added successfully");
	 Iterator i = arr.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }

 }
 void removeElement(int ele)
 {
	 arr.remove(ele);
 }
 void printElements()
 {
	 Iterator i = arr.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
 }
}