import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorExample {
	public static void main(String args[]) {
		Vector<String> vec=new  Vector<String>(2);
		System.out.println("capacity"+vec.capacity());
		vec.add("a");
		vec.add("bb");
		vec.add("ccc");
		vec.add("dddd");
		System.out.println("capacity"+vec.capacity());
		System.out.println("enter the element you want to enter");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		vec.add(n);
		Collections.reverse(vec);
		System.out.println("reverse="+vec);
		vec.addElement("gggg");
		System.out.println("last :"+vec.lastElement());
		System.out.println("afte adding="+vec);
		System.out.println("using get"+vec.get(1));
		Object o = vec.clone();
		boolean b=vec.contains("adsdf");
		System.out.println("cntains ="+b);
		System.out.println("using isEmpty"+vec.isEmpty());
		vec.removeAllElements();
		System.out.println("afer poll="+vec);
	}
}
