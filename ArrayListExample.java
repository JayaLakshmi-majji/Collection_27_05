import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("enter the element you want to enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		al.add(n);
		for(Integer num:al)
			System.out.println(num);
		al.remove(3);//index
		al.remove(3);//object
		System.out.println(al.get(0));//using get function
		System.out.println("using enumerator");
		Enumeration<Integer> e = Collections.enumeration(al);
		while(e.hasMoreElements()) {
			 System.out.println(e.nextElement());
			 
		 }
		 System.out.println("using iterator");
		 Iterator<Integer> i = al.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
			 
		 }
		 System.out.println("size="+al.size());
		 }
}
