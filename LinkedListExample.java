import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
	public static void main(String args[]) {
		LinkedList<String> al=new  LinkedList<>();
		al.add("a");
		al.add("1");
		al.add("ccc");
		al.add("dddd");
		System.out.println("enter the element you want to enter");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		al.add(n);
		Collections.reverse(al);
		System.out.println("reverse="+al);
		al.addFirst("gggg");
		al.addLast("ffff");
		System.out.println("afte adding="+al);
		System.out.println("using get"+al.get(1));
		Object o = al.clone();
		boolean b=al.contains("adsdf");
		System.out.println("cntains ="+b);
		System.out.println("using poll"+al.poll());
		System.out.println("afer poll="+al);
		for (Object object : al) {
			if(object instanceof String)
			System.out.println(object);
		}
	}
}
