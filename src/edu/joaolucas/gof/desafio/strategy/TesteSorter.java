package edu.joaolucas.gof.desafio.strategy;

import java.util.ArrayList;
import java.util.List;

public class TesteSorter {
	public static void main(String[] args) {
		Sorter sorter = new InsertionSorter();
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(25);

		List<Integer> list2 = sorter.sort(list);
		for (Integer integer : list2) {
			System.out.println(integer);
		}

		Sorter sorter2 = new SelectionSorter();
		List<Integer> list3 = sorter2.sort(list);
		for (Integer integer : list3) {
			System.out.println(integer);
		}
	}
}
