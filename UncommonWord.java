package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UncommonWord {
	
public static void main(String[] args) {
		
		String str1="this apple is sweet.";
		String str2="this apple is sour.";
		System.out.println(findMostUncommonWords(str1, str2));
}
	static  List<String> findMostUncommonWords(String str1, String str2) {
						 
			 
				
			 List<String> list1 = Arrays.asList(str1.replaceAll("[-+.^:,]","").split(" "));
			 List<String> list2 = Arrays.asList(str2.replaceAll("[-+.^:,]","").split(" "));
			
		  List<String> uncommonWords= list1.stream().filter(e->!list2.contains(e)).collect(Collectors.toList());
		   
		  return uncommonWords;
		  	}

}
