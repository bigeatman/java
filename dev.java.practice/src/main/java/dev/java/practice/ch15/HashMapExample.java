package dev.java.practice.ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public HashMapExample() {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("총 엔티티 수 : " + map.size());
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();

		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		map.remove("홍길동");
		System.out.println("총 엔티티 수 : " + map.size());

		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator2 = entries.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Integer> entry = iterator2.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		map.clear();
		System.out.println("총 엔티티 수 : " + map.size());
	}
}
