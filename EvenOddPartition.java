package practice;

import java.util.*;


import java.util.stream.Collectors;



public class EvenOddPartition {

	static void evenOddPartitionLists(List<Integer> list) {
		
		if (list == null ) 
			System.out.print("Invalid List");
	
		Map<Boolean, List<Integer>> map= list.stream().collect(Collectors.partitioningBy(num->num%2==0));

      for (Map.Entry<Boolean, List<Integer>> entry: map.entrySet()) {
    	  if(entry.getKey())
    		  System.out.print("Even Numbers:"+ entry.getValue());
    	  else
    		  System.out.print("Odd Numbers:"+ entry.getValue());
      }
	}




	public static void main(String[] args) {
		
		
				List<Integer> list = Arrays.asList(12, 35, 1, 10, 34, 1);
		evenOddPartitionLists(list);
	
	}
}
