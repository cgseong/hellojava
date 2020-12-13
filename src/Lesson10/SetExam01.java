package Lesson10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {3,5,2,9,7,10,6,1,4,8};
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i=0; i<n.length;i++) {
			hs.add(n[i]);
			ts.add(n[i]);
		}
		
		System.out.println(hs);
		System.out.println(ts);
		
		//Iterator<Integer> it = ts.iterator();
		//while(it.hasNext()) {
		//	System.out.print(it.next() + " ");
		//}

	}

}
