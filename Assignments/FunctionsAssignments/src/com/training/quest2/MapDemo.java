package com.training.quest2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, List<String>> hashMap = new HashMap<>();

		List<String> KarnatakaCities = new ArrayList<>();
		KarnatakaCities.add("Bangalore");
		KarnatakaCities.add("Karwar");
		KarnatakaCities.add("Udupi");
		KarnatakaCities.add("Mysore");
		KarnatakaCities.add("Manglore");

		List<String> DelhiCities = new ArrayList<>();
		DelhiCities.add("New Delhi");
		DelhiCities.add("Firozobad");
		DelhiCities.add("Siri");

		List<String> KeralaCities = new ArrayList<>();
		KeralaCities.add("Thiruvananthapuram");
		KeralaCities.add("Kannur");
		KeralaCities.add("Kasaraod");
		KeralaCities.add("Kochi");

		hashMap.put("Karnataka", KarnatakaCities);
		hashMap.put("Maharashtra", DelhiCities);
		hashMap.put("Kerala", KeralaCities);

//        System.out.println(hashMap);
//         List<String> citiesInKarnataka = hashMap.get("Karnataka");
//         System.out.println("Cities in Karnataka: " + citiesInKarnataka);
//        for(List<String> cities :hashMap.values()) {
//            System.out.println("cities "+cities);
//        }
		System.out.println(hashMap.get("Karnataka"));
		Set<String> keys = hashMap.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + hashMap.get(key));
		}
	}
}
