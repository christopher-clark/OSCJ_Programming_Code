package com.chris.oscjp.chapter7;
import java.util.*;

class MapTest {
	public static void main(String[] args) {
		Map<Object, Object> map = new HashMap<Object, Object>();
		
		map.put("k1", new Dog("aiko")); // add some key/value pairs
		map.put("k2", Pets.DOG);
		map.put(Pets.CAT, "CAT key");
		Dog d1 = new Dog("clover"); // let's keep this reference
		map.put(d1, "Dog key");
		map.put(new Cat(), "Cat key");
		System.out.println(map.get("k1")); 				// #1
		String k2 = "k2";
		System.out.println(map.get(k2)); 				// #2
		Pets p = Pets.CAT;
		System.out.println(map.get(p)); 				// #3
		System.out.println(map.get(d1)); 				// #4
		System.out.println(map.get(new Cat())); 		// #5
		System.out.println(map.size()); 				// #6
		d1.name = "magnolia";
		System.out.println(map.get(d1));				// #7
		d1.name = "clover";
		System.out.println(map.get(new Dog("clover"))); // #2
		d1.name = "arthur";
		System.out.println(map.get(new Dog("arthur"))); // #3
		}
}