package ds.dsalgo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		
		int[] arr = {1, 4, 5, 6, 2, 4, 8, 9,1};
		
		Map<Integer, Long> occurrences = Arrays.stream(arr)
	            .boxed() // Convert int to Integer
	            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		
		
		Entry<Integer, Long> entry = occurrences.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		

	}

}
