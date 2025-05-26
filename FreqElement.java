package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqElement {
	
public static void main(String[] args) {
		
		Integer [] arr =new Integer[] {12, 35, 1, 10, 34, 1};
		System.out.println(findMostFrequentElement(arr));
}
	static  Object findMostFrequentElement(Integer [] arr) {
						 
			if (arr == null || arr.length==0) 
				 return null;
			 Long max=(long) 0;
			 Integer freqElement=0;
				
			 List<Integer> list = Arrays.asList(arr);
			 List<Integer> tieElements= new ArrayList<>();
			
		   Map<Integer, Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		    
		   for (Entry<Integer, Long> entry: map.entrySet()) {
			   if (entry.getValue()>max) {
				   max=entry.getValue();
				   freqElement=entry.getKey();
			   }
			   else if (entry.getValue()==max) {
				   max=entry.getValue();
				   tieElements.add(entry.getKey());
			   }
			   
		   }
		   if (freqElement!=0)
		      return freqElement;
		   else return 
				   tieElements;
		}

}
