package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayLst {

	/*
	 * Insertion order is maintained
	 * Duplicate allowed
	 * non synchronized.It should not be used in multi-threading
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		arrayListExample();

	}
	
	
	public static void arrayListExample() {
		List<String> al = new ArrayList<String>();
		System.out.println("initial: "+al);
		al.add("Benz");
		al.add("BMW");
		al.add("Benz");
		al.add("Honda");
		System.out.println("After adding : "+al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Benz"));
		System.out.println(al.lastIndexOf("Benz"));
		
		List<String> aal= new ArrayList<String>();
		System.out.println("Before copying : "+aal);
		aal.addAll(al);
		System.out.println("After copying : "+aal);
		System.out.println("Before removing the zero's index : "+aal);
		aal.remove(0);
		System.out.println("After removing the zero's index : "+aal);
		aal.clear();
		System.out.println("After clear : "+aal);
		System.out.println(aal.isEmpty());
		
		//iterate
		for(String st: al) {
			System.out.println(st);
			al.add("TATA");
		}
		System.out.println("-------------------------------");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-------------------------------");
		ListIterator<String> iterator=al.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-------------------------------");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		System.out.println("-------------------------------");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
