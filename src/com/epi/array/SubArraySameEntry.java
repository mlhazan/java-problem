package com.epi.array;
/**
 * Write a program that takes an array/arraylist of integer and finds longest 
 * sub array/arraylist whose entries are equal
 */
import java.util.Arrays;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class SubArraySameEntry {
 
  public static void main (String[] args) {
		List<Integer> arr = Arrays.asList(1, 2, 2, 0, 0, 0, 1, 1, 1, 1);
		List<Integer> result = getMaxSame(arr);
		System.out.println(result);
	}
	private static List<Integer> getMaxSame(List<Integer> input) {
		Map<Integer, int[]> counts = new HashMap<>();
		int last = 0;
		int[] counter = null;
		int maxValue = 0, maxCount = 0;
		for (Integer value : input) {
			if (counter != null && value != last) {
				counter = counts.get(value);
			}
			if (counter == null)
				counts.put(value, counter = new int[1]);
			if (++counter[0] > maxCount) {
				maxValue = value;
				maxCount = counter[0];
			}
	        last = value;
		}
		Integer[] result = new Integer[maxCount];
		Arrays.fill(result, maxValue);
		return Arrays.asList(result);
	}
}