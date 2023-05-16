package com.ojas.dailytask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup {
	public static void anagramGroup(String words[]) {
		Map<String, List<String>> anagramGroups = new HashMap<>();

		for (String word : words) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			String canonicalForm = new String(charArray);

			if (anagramGroups.containsKey(canonicalForm)) {
				anagramGroups.get(canonicalForm).add(word);
			} else {
				List<String> group = new ArrayList<>();
				group.add(word);
				anagramGroups.put(canonicalForm, group);
			}
		}

		for (List<String> group : anagramGroups.values()) {
			System.out.println(group);
		}

	}

	public static void main(String[] args) {
		String[] words = { "CARS", "REPAID"," DUES", "NOSE", "SIGNED", "LANE", "PAIRED", "ARCS", "GRAB", "USED", "ONES", "BRAG", "SUED", "LEAN", "SCAR", "DESIGN" };
		anagramGroup(words);

	}
}
