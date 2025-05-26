package practice;

import java.util.ArrayList;
import java.util.List;

public class P1 {
	
	public static void main(String[] args) {
	ArrayList<ArrayList<Integer>> listOLists = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> singleList = new ArrayList<Integer>();
	singleList.add(10);
	singleList.add(20);
	listOLists.add(singleList);

	ArrayList<Integer> anotherList = new ArrayList<Integer>();
	anotherList.add(10);
	listOLists.add(anotherList);
	
	int sumList=listOLists.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum();
	System.out.print(sumList);

	
	}

}
