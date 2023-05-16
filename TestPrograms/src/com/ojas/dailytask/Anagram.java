package com.ojas.dailytask;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TrieNode
{
	Map<Character, TrieNode> child = new HashMap<>();

	String words = "";
}

class Anagram
{
	
	public static void insert(TrieNode root, String word, String originalWord)
	{
	
		TrieNode curr = root;
		for (char c: word.toCharArray())
		{
			
			curr.child.putIfAbsent(c, new TrieNode());

			
			curr = curr.child.get(c);
		}

		
		curr.words += originalWord + " ";
	}

	
	public static void printAnagrams(TrieNode root)
	{
		
		if (root == null) {
			return;
		}

		
		if (root.words.length() > 1) {
			System.out.println(root.words);
		}

		
		for (TrieNode child: root.child.values()) {
			printAnagrams(child);
		}
	}

	
	public static void groupAnagrams(String[] words)
	{
		
		TrieNode root = new TrieNode();

		
		for (String word: words)
		{
			

			String sorted = Stream.of(word.toCharArray())
					.map(chars -> { Arrays.sort(chars); return new String(chars); })
					.collect(Collectors.joining());

			insert(root, sorted, word);
		}

		printAnagrams(root);
	}

	public static void main(String[] args)
	{
		String[] words = {
				"auctioned", "actors", "altered", "streaming", "related",
				"education", "aspired", "costar", "despair", "mastering"
		};

		groupAnagrams(words);
	}
}
