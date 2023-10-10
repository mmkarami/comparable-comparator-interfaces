package com.mmkarami.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparison {

	public static Object findTheBestByJavaArraysSort(Object[] objs) {
		Arrays.sort(objs);
		return objs[objs.length - 1];
	}

	public static <T> Object findTheBestByJavaArraysSort(T[] objs, Comparator<? super T> comparator) {
		Arrays.sort(objs, comparator);
		return objs[objs.length - 1];
	}

	public static <T extends Comparable<T>> T findTheBestByJavaCollectionsSort(List<T> list) {
		Collections.sort(list);
		return list.get(list.size() - 1);
	}

	public static <T> T findTheBestByJavaCollectionsSort(List<T> list, Comparator<? super T> comparator) {
		Collections.sort(list, comparator);
		return list.get(list.size() - 1);
	}

	public static <T extends Comparable<T>> T findTheBest(List<T> list) {
		T theBest = list.get(0);
		for (T t : list) {
			Comparable<T> comparable = (Comparable<T>) t;
			if (comparable.compareTo(theBest) > 0)
				theBest = t;
		}
		return theBest;
	}

	public static <T> T findTheBest(List<T> list, Comparator<? super T> comparator) {
		T theBest = list.get(0);
		for (T t : list) {
			if (comparator.compare(t, theBest) > 0)
				theBest = t;
		}
		return theBest;
	}
}