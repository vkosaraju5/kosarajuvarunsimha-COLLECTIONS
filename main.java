package listoperations;

import java.util.*;
import java.lang.*;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
	   while(true)
	   {
	 System.out.println("enter your choice:1.Fetching\n 2.Adding\n 3.Removing\n 4.Printing");
	   int choice=sc.nextInt();
	 Operations obj = new Operations();
	 switch(choice) {
	 case 1:
		 System.out.println("enter the position to be fetched:");
		 int pos=sc.nextInt();
		 int result=obj.fetchElements(pos);
		 System.out.println(result);
		 break;
	 case 2:
		 System.out.println("Enter the element to be added: ");
		 int element=sc.nextInt();
		 obj.AddElement(element);
		 break;
	 case 3:
		 System.out.println("Enter the element to be removed: ");
		 int ele=sc.nextInt();
		 obj.removeElement(ele);
		 break;
	 case 4:
		 obj.printElements();
		 break;
	 case 5:
		 System.exit(0);
	 
		 
	 } 
	 }
		
	}

}