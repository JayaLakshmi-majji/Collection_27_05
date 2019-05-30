import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String args[]) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		System.out.println("enter the number of element you want to enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		while(i<n) {
			int temp = sc.nextInt();
			ts.add(temp);
			i++;
		}
		System.out.println(ts);
		System.out.println(ts.higher(57));
		System.out.println("ceil :"+ts.ceiling(57));
		System.out.println("sorted headset :"+ts.headSet(5));
	}
}
