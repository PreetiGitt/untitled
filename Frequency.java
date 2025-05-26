package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Frequency {
	
public static void main(String[] args) throws Exception {
		
	List <String> list=Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
	
	System.out.print(findWordOccurence(list));
}
	static  Map<String, Long> findWordOccurence(List<String> list ) throws Exception {
		
		
		if (list==null || list.size()==0) {
			throw new Exception("Invalid list");
		}
		return list.stream()
	            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		
		
		 
	}

}
