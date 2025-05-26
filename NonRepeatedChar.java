package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedChar {
	
public static void main(String[] args) throws Exception {
		
	String str="swiss";
	
	System.out.print(findNonRepeatedChar(str));
}
	static  String findNonRepeatedChar(String str ) throws Exception {
		
		String repeatedElement=null;
						 
		if (str==null || str.length()==0) {
			throw new Exception("Invalid String");
		}
		Map<String, Long> map = Arrays.stream(str.split(""))
	            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		
		for (Map.Entry<String, Long> entry:map.entrySet()) {
			 if (entry.getValue()==1) {
				 repeatedElement=entry.getKey();
				 break;
			 }
		}
		 
		return repeatedElement;
	}

}
