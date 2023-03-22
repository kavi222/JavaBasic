package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List is ordered and duplicate value allowed
		//execution order is ordered, null value allowed
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add(null);
		list.add(null);
		for(String a: list) {
			System.out.println(a);
			
		}
		int listSize = list.size();
		System.out.println(listSize);

		
		System.out.println("--------------");
		
		//Set is unordered and unique duplicate value are not allowed
		//execution order is unordered
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		set.add(null);
		set.add(null);
		
		for(String b: set) {
			System.out.println(b);	
		}
		
		int setSize = list.size();
		System.out.println(setSize);
	
		System.out.println("--------------");
		
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(1, "a");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " "
                    + m.getValue());	
		}
	}

}
