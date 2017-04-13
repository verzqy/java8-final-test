package com.mitrais.java8.finaltest.vernando.Final_Test;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class WordUtils {

	private static String outputFile = "randomWords.txt";

	public static long generateRandomNames(int numOfNames) throws Exception {
		Random rand = new Random();
		List<String> randomNames = new ArrayList<String>();
		String word = "";
		int wLength = 0;
		for (int i = 0; i < numOfNames; i++) {
			wLength = rand.nextInt(20)+1;
			for(int j=0; j<wLength; j++){
				word += (char)(Math.random() * 26 + 97); 
			}
			randomNames.add(word);
			word = "";
		}
		Files.write(Paths.get(outputFile),randomNames, Charset.defaultCharset());
		return randomNames.stream().count();
	}
	
	public static long showAllRandomNames() throws Exception {
		List<String> randomNames = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());
		randomNames.forEach(s -> System.out.println(s));
		return randomNames.stream().count();
	}
	
	public static String mostLongName() throws Exception {
		return Files.lines(Paths.get(outputFile)).max((e1, e2) -> e1.length() - e2.length()).get();
	}
	
	public static String mostShortName() throws Exception {
		return Files.lines(Paths.get(outputFile)).max((e1, e2) -> e2.length() - e1.length()).get();
	}
	
	public static long nameContains(String containWord) throws Exception {
		return Files.lines(Paths.get(outputFile)).filter(s -> s.contains(containWord.toLowerCase())).count();
	}
	
	public static long makeExcited() throws Exception {
		List<String> randomNames = Files.lines(Paths.get(outputFile)).map(s -> s+"!").collect(Collectors.toList());
		Files.write(Paths.get(outputFile),randomNames, Charset.defaultCharset());
		return randomNames.stream().count();
	}
	
	public static long removeContains(String containWord) throws Exception {
		List<String> randomNames = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());
		long temp = randomNames.stream().count();
		randomNames.removeIf(s -> s.contains(containWord.toLowerCase()));
		Files.write(Paths.get(outputFile),randomNames, Charset.defaultCharset());
		return temp - randomNames.stream().count();
	}
}
