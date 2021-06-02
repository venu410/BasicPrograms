package com.venu.basic.programs;
import java.util.HashMap;
import java.util.Map;

public class MapIterationDemo {

	public static void main(String[] args) {

		Map<String, String> smp = new HashMap<String, String>();
		smp.put("TSRTC", "1800-296-719");
		smp.put("KSRTC", "1800-296-198");
		smp.put("APSRTC", "1800-296-217");

		for (Map.Entry<String, String> e : smp.entrySet()) {
			System.out.println("Key: " + e.getKey() + " Vlaue:" + e.getValue());


		}
		System.out.println();

		System.out.println("Using Java 8");

		smp.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

		System.out.println();
		System.out.println("Using Streams");
		smp.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + " Value: " + e.getValue()));

		System.out.println();
		System.out.println("Using Streams get TSRTC Value");

		smp.entrySet().stream().filter(map -> map.getKey().equals("TSRTC"))
				.forEach(e -> System.out.println(e.getValue()));
	}
}